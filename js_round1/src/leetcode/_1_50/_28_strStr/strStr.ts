// https://leetcode.com/problems/implement-strstr/

function strStr(haystack: string, needle: string): number {
  if (needle.length === 0) {
    return 0;
  }

  if (haystack.length < needle.length) {
    return -1;
  }

  for (let i = 0; i < haystack.length; i++) {
    if (haystack[i] === needle[0]) {
      let j = 1;
      while (
        j < needle.length &&
        i + j < haystack.length &&
        haystack[i + j] === needle[j]
      ) {
        j++;
      }

      if (j === needle.length) {
        return i;
      }
    }
  }

  return -1;
}
