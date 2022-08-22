// https://leetcode.com/problems/reverse-integer/
function reverse(x: number): number {
  const sign = Math.sign(x);
  let absX = Math.abs(x);
  let result = 0;

  while (absX > 0) {
    result = result * 10 + (absX % 10);
    if (result > 2 ** 31 - 1) {
      return 0;
    }
    absX = Math.floor(absX / 10);
  }

  return sign * result;
}
