// https://leetcode.com/problems/sort-array-by-parity-ii/

function sortArrayByParityII(nums: number[]): number[] {
  const swap = (arr: number[], i: number, j: number) => {
    const temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  };

  let i = 0;
  let j = 1;
  while (i < nums.length && j < nums.length) {
    while (i < nums.length && nums[i] % 2 === 0) {
      i += 2;
    }

    while (j < nums.length && nums[j] % 2 === 1) {
      j += 2;
    }

    if (i < nums.length && j < nums.length) {
      swap(nums, i, j);
    }
  }

  return nums;
}

// function sortArrayByParityII(nums: number[]): number[] {
//   let evenIndex = 0;
//   let oddIndex = 1;

//   const res = new Array(nums.length).fill(0);
//   nums.forEach((num) => {
//     if (num % 2 === 0) {
//       res[evenIndex] = num;
//       evenIndex += 2;
//     } else {
//       res[oddIndex] = num;
//       oddIndex += 2;
//     }
//   });

//   return res;
// }

export default sortArrayByParityII;
