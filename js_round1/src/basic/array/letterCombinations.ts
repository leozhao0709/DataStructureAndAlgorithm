// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

function letterCombinations(digits: string): string[] {
  if (digits.length === 0) {
    return [];
  }

  const letterArr = [
    '',
    '',
    'abc',
    'def',
    'ghi',
    'jkl',
    'mno',
    'pqrs',
    'tuv',
    'wxyz',
  ];

  const digitsArr = digits.split('');
  const firstDigitsArray = letterArr[parseInt(digitsArr[0])].split('');

  if (digitsArr.length === 1) {
    return firstDigitsArray;
  }

  const merge2DigitsArr = (d1: string[], d2: string[]): string[] => {
    const result: string[] = [];
    for (const char1 of d1) {
      for (const char2 of d2) {
        result.push(char1 + char2);
      }
    }
    return result;
  };

  return digitsArr.slice(1).reduce((prev, curr) => {
    return merge2DigitsArr(prev, letterArr[parseInt(curr)].split(''));
  }, firstDigitsArray);
}

export default letterCombinations;
