function moveZeroes(nums: number[]): void {
  let i = 0;

  const swap = (nums: number[], i: number, j: number) => {
    const temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  };

  while (i < nums.length) {
    if (nums[i] !== 0) {
      i++;
    } else {
      let j = i + 1;
      while (j < nums.length) {
        if (nums[j] === 0) {
          j++;
        } else {
          swap(nums, i, j);
          break;
        }
      }
      i++;
    }
  }
}
