// https://leetcode.com/problems/word-ladder-ii/

function findLadders(
  beginWord: string,
  endWord: string,
  wordList: string[]
): string[][] {
  const vertex = new Set<string>();
  const graph = new Map<string, Set<string>>();

  const depth = BFSBuildGraph(beginWord, endWord, wordList, vertex, graph);

  if (depth === -1) {
    return [];
  }

  return DFSSearch(beginWord, endWord, graph, depth);
}

function BFSBuildGraph(
  beginWord,
  endWord,
  wordList,
  vertex: Set<string>,
  graph: Map<string, Set<string>>
): number {
  const wordSet = new Set(wordList);
  const queue: string[] = [beginWord];
  let depth = 0;
  vertex.add(beginWord);
  let stopAtCurrentLevel = false;
  while (queue.length > 0 && !stopAtCurrentLevel) {
    depth++;
    const queueLength = queue.length;
    for (let i = 0; i < queueLength; i++) {
      // these word already traversed in previous level
      vertex.add(queue[i]);
    }

    const seenInCurrentLevel = new Set<string>();
    for (let i = 0; i < queueLength; i++) {
      const word = queue.shift()!;

      if (!graph.has(word)) {
        graph.set(word, new Set<string>());
      }
      for (let i = 0; i < word.length; i++) {
        const charArr = word.split('').map((char) => char.charCodeAt(0));
        for (let j = 97; j < 97 + 26; j++) {
          charArr[i] = j;
          const nextWord = String.fromCharCode(...charArr);

          if (wordSet.has(nextWord) && !vertex.has(nextWord)) {
            if (nextWord === endWord) {
              stopAtCurrentLevel = true;
            }
            if (!seenInCurrentLevel.has(nextWord)) {
              queue.push(nextWord);
              seenInCurrentLevel.add(nextWord);
            }
            graph.get(word)?.add(nextWord);
          }
        }
      }
    }
  }
  // if (stopAtCurrentLevel) {
  //   vertex.add(endWord);
  //   graph.set(endWord, new Set<string>());
  // }

  if (!stopAtCurrentLevel) {
    return -1;
  }

  return depth + 1;
}

function DFSSearch(
  beginWord: string,
  endWord: string,
  graph: Map<string, Set<string>>,
  maxDepth: number,
  depth = 1,
  cache = new Map<string, string[][]>()
): string[][] {
  if (beginWord === endWord) {
    return [[beginWord]];
  }

  if (depth >= maxDepth) {
    return [];
  }

  const result: string[][] = [];
  const edges = graph.get(beginWord)!;
  for (const word of edges) {
    let paths: string[][] = [];
    if (cache.has(word)) {
      paths = cache.get(word)!;
    } else {
      paths = DFSSearch(word, endWord, graph, maxDepth, depth + 1, cache);
      cache.set(word, paths);
    }

    paths.forEach((path) => {
      if (path.length > 0) {
        result.push([beginWord, ...path]);
      }
    });
  }
  return result;
}

const beginWord = 'hot';
const endWord = 'dog';
const wordList = ['hot', 'cog', 'dog', 'tot', 'hog', 'hop', 'pot', 'dot'];

// console.log(findLadders(beginWord, endWord, wordList));

export default findLadders;
