// https://leetcode.com/problems/longest-common-prefix/

// function longestCommonPrefix(strs: string[]): string {
//   if (strs.length === 1) {
//     return strs[0];
//   }

//   let commonPrefix = strs[0];
//   for (let i = 1; i < strs.length; i++) {
//     commonPrefix = getCommonPrefix(commonPrefix, strs[i]);
//   }

//   return commonPrefix;
// }

function longestCommonPrefix(strs: string[]): string {
  return commonPrefix(strs, 0, strs.length - 1);
}

function commonPrefix(strs: string[], left: number, right: number): string {
  if (left >= right) {
    return strs[left];
  }

  const mid = Math.floor((left + right) / 2);
  const leftCommonPrefix = commonPrefix(strs, left, mid);
  const rightCommonPrefix = commonPrefix(strs, mid + 1, right);

  return getCommonPrefix(leftCommonPrefix, rightCommonPrefix);
}

function getCommonPrefix(str1: string, str2: string) {
  let common = '';
  let i = 0;
  while (i < str1.length && i < str2.length) {
    if (str1[i] !== str2[i]) {
      return common;
    }
    common += str1[i];
    i++;
  }
  return common;
}
