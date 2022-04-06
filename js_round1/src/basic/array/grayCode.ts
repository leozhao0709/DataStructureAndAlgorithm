// https://leetcode.com/problems/gray-code/

function grayCode(n: number): number[] {
  const res = [0, 1];

  if (n === 1) {
    return res;
  }

  for (let i = 2; i <= n; i++) {
    [...res].reverse().forEach((val) => {
      res.push(2 ** (i - 1) + val);
    });
  }

  return res;
}

export default grayCode;
