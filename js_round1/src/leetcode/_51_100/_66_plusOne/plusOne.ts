// https://leetcode.com/problems/plus-one/

function plusOne(digits: number[]): number[] {
  const length = digits.length;
  const result = new Array(length + 1).fill(0);

  let carry = 1;
  for (let i = length - 1; i >= 0; i--) {
    const temp = digits[i] + carry;
    result[i + 1] = temp % 10;
    carry = temp >= 10 ? 1 : 0;
  }

  result[0] = carry;
  return carry === 1 ? result : result.slice(1);
}
