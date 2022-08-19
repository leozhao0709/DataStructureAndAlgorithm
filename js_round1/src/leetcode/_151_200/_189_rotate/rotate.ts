/**
 Do not return anything, modify nums in-place instead.
 */
// function rotate(nums: number[], k: number): void {
//   k = k % nums.length;
//   if (k === 0) {
//     return;
//   }

//   const last = nums[nums.length - 1];
//   let temp;
//   let prev = nums[0];
//   for (let i = 0; i + 1 < nums.length; i++) {
//     temp = nums[i + 1];
//     nums[i + 1] = prev;
//     prev = temp;
//   }

//   nums[0] = last;
//   rotate(nums, k - 1);
// }

function rotate(nums: number[], k: number): void {
  k = k % nums.length;

  if (k === 0) {
    return;
  }

  let count = 0;
  let start = 0;
  let i = start;
  let prev = nums[start];
  while (count < nums.length) {
    do {
      const nextIndex = (i + k) % nums.length;
      const temp = nums[nextIndex];
      nums[nextIndex] = prev;
      prev = temp;
      i = nextIndex;
      count++;
    } while (i !== start);

    start++;
    i = start;
    prev = nums[start];
  }
}
