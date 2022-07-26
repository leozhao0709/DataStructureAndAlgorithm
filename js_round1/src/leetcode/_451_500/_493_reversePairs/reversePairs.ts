// https://leetcode.com/problems/reverse-pairs/

function reversePairs(nums: number[]): number {
  const result = mergeSortAndCount(nums);
  return result;
}

function mergeSortAndCount(
  nums: number[],
  left = 0,
  right = nums.length - 1
): number {
  if (left >= right) {
    return 0;
  }

  const mid = left + Math.floor((right - left) / 2);
  const leftCount = mergeSortAndCount(nums, left, mid);
  const rightCount = mergeSortAndCount(nums, mid + 1, right);

  return leftCount + mergeAndCount(nums, left, mid, right) + rightCount;
}

// [1, 2] [5, 6, 7, 8]
function mergeAndCount(
  nums: number[],
  left: number,
  mid: number,
  right: number
): number {
  const leftArr = [...nums.slice(left, mid + 1)];
  const rightArr = [...nums.slice(mid + 1, right + 1)];

  let i = 0,
    j = 0,
    k = left;

  let count = 0;
  while (i < leftArr.length && j < rightArr.length) {
    if (leftArr[i] > 2 * rightArr[j]) {
      count += leftArr.length - i;
      j++;
    } else {
      i++;
    }
  }

  i = 0;
  j = 0;

  while (i < leftArr.length && j < rightArr.length) {
    if (leftArr[i] < rightArr[j]) {
      nums[k] = leftArr[i];
      i++;
    } else {
      nums[k] = rightArr[j];
      j++;
    }
    k++;
  }

  while (i < leftArr.length) {
    nums[k] = leftArr[i];
    k++;
    i++;
  }

  while (j < rightArr.length) {
    nums[k] = rightArr[j];
    k++;
    j++;
  }

  return count;
}

export default reversePairs;
