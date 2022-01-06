// leetcode 696
function countBinarySubstrings(s: string): number {
  if (s.length < 2) {
    return 0;
  }

  let i = 0;
  const iStart = s[i];
  while (i < s.length && s[i] === iStart) {
    i++;
  }

  if (i >= s.length) {
    return 0;
  }

  let count = 0;
  let j = 0;
  const jStart = s[i];
  while (j + i < s.length && s[j + i] === jStart && j < i) {
    count++;
    j++;
  }

  if (j + i >= s.length) {
    return count;
  }

  return count + countBinarySubstrings(s.substring(i));
}

export default countBinarySubstrings;
