function lengthOfLongestSubstring(s: string): number {
  if (s.length === 0) {
    return 0;
  }

  const map = new Map<string, number>();
  let start = 0;
  let curr = 0;
  let maxLength = 0;
  while (curr < s.length) {
    const currStr = s.charAt(curr);
    if (map.has(currStr) && map.get(currStr)! >= start) {
      maxLength = Math.max(maxLength, curr - start);
      start = Math.max(start, map.get(currStr)!) + 1;
    }
    map.set(currStr, curr);
    curr++;
  }

  return Math.max(maxLength, curr - start);
}

export default lengthOfLongestSubstring;
