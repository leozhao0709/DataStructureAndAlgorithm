// https://leetcode.com/problems/valid-palindrome/

function isPalindrome(s: string): boolean {
  s = s.toLowerCase();
  let word = '';
  for (let i = 0; i < s.length; i++) {
    if (
      (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
      (s.charAt(i) >= '0' && s.charAt(i) <= '9')
    ) {
      word += s.charAt(i);
    }
  }

  let i = 0;
  let j = word.length - 1;
  while (i < j) {
    if (word.charAt(i) !== word.charAt(j)) {
      return false;
    }
    i++;
    j--;
  }

  return true;
}
