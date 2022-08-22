function myAtoi(s: string): number {
  const matchRes = s.match(/^\s*([+|-])?(\d+)(.*)/);
  if (!matchRes) {
    return 0;
  }
  const sign = matchRes[1] === '-' ? -1 : 1;
  const numberStr = matchRes[2];
  let res = 0;
  for (let i = 0; i < numberStr.length; i++) {
    res = res * 10 + (numberStr.charCodeAt(i) - '0'.charCodeAt(0));
    if (res > 2 ** 31 - 1) {
      return sign === 1 ? 2 ** 31 - 1 : -(2 ** 31);
    }
  }

  return sign * res;
}
