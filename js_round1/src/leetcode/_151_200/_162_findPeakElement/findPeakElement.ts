// https://leetcode.com/problems/find-peak-element/
function findPeakElement(nums: number[]): number {
  return binarySearchPeak(nums, 0, nums.length - 1);
}

function binarySearchPeak(nums: number[], start: number, end: number): number {
  if (start === end) {
    return end;
  }

  const mid = Math.floor(start + (end - start) / 2);

  if (nums[mid] > nums[mid + 1]) {
    return binarySearchPeak(nums, start, mid);
  }

  return binarySearchPeak(nums, mid + 1, end);
}

// test
const nums = [1, 2, 3, 1];
// eslint-disable-next-line no-console
console.log(findPeakElement(nums));
