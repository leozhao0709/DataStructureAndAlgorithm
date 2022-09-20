function sortArray(nums: number[]): number[] {
  return helper(nums, 0, nums.length - 1);
}

function helper(nums: number[], start: number, end: number): number[] {
  if (start > end) {
    return [];
  }

  const candidateIndex = partition(nums, start, end);
  helper(nums, start, candidateIndex - 1);
  helper(nums, candidateIndex + 1, end);
  return nums;
}

function partition(nums: number[], start: number, end: number): number {
  const candidate = nums[start];
  let i = start + 1;
  let j = end;

  while (i <= j) {
    while (i <= end && nums[i] <= candidate) {
      i++;
    }

    while (j >= start + 1 && nums[j] >= candidate) {
      j--;
    }

    if (i < j) {
      swap(nums, i, j);
      i++;
      j--;
    }
  }

  swap(nums, start, j);
  return j;
}

function swap(nums: number[], i: number, j: number) {
  const temp = nums[i];
  nums[i] = nums[j];
  nums[j] = temp;
}
