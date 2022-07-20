// https://leetcode.com/problems/word-ladder/

function ladderLength(
  beginWord: string,
  endWord: string,
  wordList: string[]
): number {
  if (!wordList.includes(endWord)) {
    return 0;
  }

  const wordSet = new Set(wordList);
  const queue = [beginWord];

  let steps = 0;
  while (queue.length > 0) {
    steps++;
    const queueSize = queue.length;
    for (let i = 0; i < queueSize; i++) {
      const word = queue.shift()!;
      for (let j = 0; j < word.length; j++) {
        const charArr = word.split('').map((char) => char.charCodeAt(0));
        for (let k = 97; k < 97 + 26; k++) {
          charArr[j] = k;
          const nextWord = String.fromCharCode(...charArr);
          if (wordSet.has(nextWord)) {
            if (nextWord === endWord) {
              return steps + 1;
            }
            wordSet.delete(nextWord);
            queue.push(nextWord);
          }
        }
      }
    }
  }
  return 0;
}

export default ladderLength;
