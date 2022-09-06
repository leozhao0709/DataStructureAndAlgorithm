function romanToInt(s: string): number {
  const map = new Map<string, number>([
    ['I', 1],
    ['V', 5],
    ['X', 10],
    ['L', 50],
    ['C', 100],
    ['D', 500],
    ['M', 1000],
  ]);

  const sLength = s.length;
  let res = 0;
  for (let i = 0; i < sLength; i++) {
    res += map.get(s[i])!;
    if (i > 0 && map.get(s[i - 1])! < map.get(s[i])!) {
      res -= 2 * map.get(s[i - 1])!;
    }
  }

  return res;
}
