// https://leetcode.com/problems/minimum-number-of-frogs-croaking/

function minNumberOfFrogs(croakOfFrogs: string): number {
  const countMap = new Map([
    ['c', 0],
    ['r', 0],
    ['o', 0],
    ['a', 0],
    ['k', 0],
  ]);

  const prevMap = new Map([
    ['r', 'c'],
    ['o', 'r'],
    ['a', 'o'],
    ['k', 'a'],
  ]);

  let frogCount = 0;
  let freeFrogsCount = 0;
  for (let i = 0; i < croakOfFrogs.length; i++) {
    const char = croakOfFrogs.charAt(i);
    if (!'croak'.includes(char)) {
      return -1;
    }
    countMap.set(char, countMap.get(char)! + 1);
    if (char === 'c') {
      if (freeFrogsCount > 0) {
        freeFrogsCount--;
      } else {
        frogCount++;
      }
    } else {
      if (countMap.get(prevMap.get(char)!)! < countMap.get(char)!) {
        return -1;
      }
    }
    if (char === 'k') {
      // end yell
      freeFrogsCount++;

      for (const [key, value] of countMap) {
        countMap.set(key, value - 1);
      }
    }
  }

  return freeFrogsCount === frogCount ? frogCount : -1;
}

// test
const croakOfFrogs = 'cccccccrrooaakk';
// eslint-disable-next-line no-console
console.log(minNumberOfFrogs(croakOfFrogs));
