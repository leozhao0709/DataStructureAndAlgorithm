// https://leetcode.com/problems/word-ladder/

function ladderLength(
  beginWord: string,
  endWord: string,
  wordList: string[]
): number {
  if (!wordList.includes(endWord)) {
    return 0;
  }

  return ladderLengthWithSteps(beginWord, endWord, wordList);
}

function ladderLengthWithSteps(
  beginWord: string,
  endWord: string,
  wordList: string[],
  steps = 0
): number {
  if (steps > wordList.length) {
    return 0;
  }

  if (beginWord === endWord) {
    return steps;
  }

  const beginWordCharArr = beginWord
    .split('')
    .map((char) => char.charCodeAt(0));
  for (let i = 0; i < beginWordCharArr.length; i++) {}
}

export default ladderLength;
