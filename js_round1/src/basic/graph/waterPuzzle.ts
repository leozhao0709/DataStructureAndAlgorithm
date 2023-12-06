// 3 buckets capacity: a: 10L, b: 5L, c: 6L
// initial volume: a: 0L, b: 5L, c: 6L
// target volume: a: 8L, b: any, c: any

interface BucketState {
  a: number;
  b: number;
  c: number;
}

type BucketCapacity = BucketState;

const waterPuzzle = (
  bucketCapacity = {
    a: 10,
    b: 5,
    c: 6,
  },
  initialState = {
    a: 0,
    b: 4,
    c: 6,
  },
  targetA = 7
) => {
  type BucketStateId = number;

  const visited = new Set<BucketStateId>();

  const preSteps = new Map<BucketState, BucketState>();

  const queue: BucketState[] = [];
  queue.push(initialState);

  while (queue.length > 0) {
    const currState = queue.shift()!;
    visited.add(getBucketStateId(currState));
    // add nextStates
    const nextStates = generateNextStates(currState, bucketCapacity);

    for (let i = 0; i < nextStates.length; i++) {
      const nextState = nextStates[i];
      if (visited.has(getBucketStateId(nextState))) {
        continue;
      }

      queue.push(nextState);
      preSteps.set(nextState, currState);
      if (nextState.a === targetA) {
        return findPath(initialState, nextState, preSteps);
      }
    }
  }

  return [];
};

function getBucketStateId(state: BucketState) {
  return 100 * state.a + 10 * state.b + state.c;
}

function findPath(
  initialState: BucketState,
  endState: BucketState,
  stepsMap: Map<BucketState, BucketState>
) {
  if (!stepsMap.has(endState)) {
    return [];
  }

  const steps: BucketState[] = [];
  let currState = endState;

  while (currState !== initialState) {
    steps.push(currState);
    currState = stepsMap.get(currState)!;
  }

  steps.push(initialState);

  return steps.reverse();
}

function generateNextStates(
  currState: BucketState,
  bucketCapacity: BucketCapacity
): BucketState[] {
  const { a, b, c } = currState;
  const nextStates: BucketState[] = [];
  // a -> b
  const aToB = Math.min(a, bucketCapacity.b - b);
  nextStates.push({
    a: a - aToB,
    b: b + aToB,
    c,
  });

  // b -> a
  const bToA = Math.min(b, bucketCapacity.a - a);
  nextStates.push({
    a: a + bToA,
    b: b - bToA,
    c,
  });

  // a -> c
  const aToC = Math.min(a, bucketCapacity.c - c);
  nextStates.push({
    a: a - aToC,
    b: b,
    c: c + aToC,
  });

  // c -> a
  const cToA = Math.min(c, bucketCapacity.a - a);
  nextStates.push({
    a: a + cToA,
    b: b,
    c: c - cToA,
  });

  // b -> c
  const bToC = Math.min(b, bucketCapacity.c - c);
  nextStates.push({
    a: a,
    b: b - bToC,
    c: c + bToC,
  });

  // c -> b
  const cToB = Math.min(c, bucketCapacity.b - b);
  nextStates.push({
    a: a,
    b: b + cToB,
    c: c - cToB,
  });

  return nextStates;
}

// main test

const path = waterPuzzle();
console.log(path);
