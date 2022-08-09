// https://leetcode.com/problems/string-compression/

function compress(chars: string[]): number {
  if (chars.length === 1) {
    return 1;
  }

  let i = 0,
    j = 0,
    k = 0;
  while (j < chars.length) {
    if (chars[i] === chars[j]) {
      j++;
    } else {
      chars[k] = chars[i];
      k++;
      if (j - i > 1) {
        let nums = j - i;
        let temp = '';
        while (nums > 0) {
          temp += nums % 10;
          nums = Math.floor(nums / 10);
        }

        const tempLen = temp.length;
        for (let i = 0; i < tempLen; i++) {
          chars[k] = temp[tempLen - 1 - i];
          k++;
        }
      }
      i = j;
    }
  }

  chars[k] = chars[i];
  k++;
  if (j - i > 1) {
    let nums = j - i;
    let temp = '';
    while (nums > 0) {
      temp += nums % 10;
      nums = Math.floor(nums / 10);
    }

    const tempLen = temp.length;
    for (let i = 0; i < tempLen; i++) {
      chars[k] = temp[tempLen - 1 - i];
      k++;
    }
  }

  return k;
}

export default compress;
