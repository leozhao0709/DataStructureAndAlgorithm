// leetcode 557
const reverseWord = (s: string): string => {
  return s
    .split(' ')
    .map((str) => {
      // return str.split('').reverse().join('');

      let i = 0;
      let j = str.length - 1;
      const charArr = [...str];
      while (i < j) {
        const temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
        i++;
        j--;
      }
      return charArr.join('');
    })
    .join(' ');
};

export default reverseWord;
