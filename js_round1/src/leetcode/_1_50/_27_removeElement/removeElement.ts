// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

function removeElement(nums: number[], val: number): number {
  let curr = 0;
  let checking = 0;

  const swap = (nums: number[], i: number, j: number) => {
    const temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  };

  let k = 0;
  while (curr < nums.length) {
    if (nums[curr] !== nums[checking]) {
      checking++;
      swap(nums, curr, checking);
    }
    curr++;
  }
  return checking + 1;
}
