// https://leetcode.com/problems/maximum-subarray/

// eslint-disable-next-line @typescript-eslint/no-unused-vars
function maxSubArray(nums: number[]): number {
  let maxSum = nums[0];
  let currentSum = nums[0];

  for (let i = 1; i < nums.length; i++) {
    currentSum = Math.max(currentSum + nums[i], nums[i]);
    maxSum = Math.max(maxSum, currentSum);
  }

  return maxSum;
}
