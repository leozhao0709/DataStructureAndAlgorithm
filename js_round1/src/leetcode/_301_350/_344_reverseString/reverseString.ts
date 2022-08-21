// https://leetcode.com/problems/reverse-string/
/**
 Do not return anything, modify s in-place instead.
 */
function reverseString(s: string[]): void {
  const length = s.length;
  let i = 0;
  const halfIndex = Math.floor(length / 2);
  while (i < halfIndex) {
    const temp = s[i];
    s[i] = s[length - i - 1];
    s[length - i - 1] = temp;
    i++;
  }
}
