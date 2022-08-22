// https://leetcode.com/problems/first-unique-character-in-a-string/

function firstUniqChar(s: string): number {
  const map = new Map<string, number | null>();

  for (let i = 0; i < s.length; i++) {
    const char = s[i];
    if (!map.has(char)) {
      map.set(char, i);
    } else {
      if (map.get(char) !== null) {
        map.set(char, null);
      }
    }
  }

  let result = -1;
  let minIndex = Number.MAX_SAFE_INTEGER;

  for (const [, val] of map) {
    if (val !== undefined && val !== null && val < minIndex) {
      result = val;
      minIndex = val;
    }
  }

  return result;
}
