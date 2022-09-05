function rob(nums: number[]): number {
  const n = nums.length;
  if (n <= 1) {
    return nums[0];
  }

  const moneys = new Array(n).fill(0);
  moneys[0] = nums[0];
  moneys[1] = Math.max(nums[1], nums[0]);

  for (let i = 2; i < n; i++) {
    moneys[i] = Math.max(moneys[i - 2] + nums[i], moneys[i - 1]);
  }

  return Math.max(moneys[n - 1], moneys[n - 2]);
}
