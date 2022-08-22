// https://leetcode.com/problems/first-unique-character-in-a-string/

function firstUniqChar(s: string): number {
  const map = new Map<string, number>();

  const n = s.length;
  for (let i = 0; i < n; i++) {
    const char = s[i];
    if (!map.has(char)) {
      map.set(char, 1);
    } else {
      const count = map.get(char)!;
      map.set(char, count + 1);
    }
  }

  for (let i = 0; i < n; i++) {
    if (map.get(s.charAt(i)) === 1) {
      return i;
    }
  }

  return -1;
}
