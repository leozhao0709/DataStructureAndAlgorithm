import { MaxHeap } from '@app/basic/heap/MaxHeap';

// https://leetcode.com/problems/kth-largest-element-in-an-array/
function findKthLargest(nums: number[], k: number): number {
  // return useHeap(nums, k);
  return usePartition(nums, 0, nums.length - 1, k);
}

function partition(
  nums: number[],
  leftIndex: number,
  rightIndex: number
): number {
  const swap = (nums: number[], i: number, j: number) => {
    const temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  };

  let i = leftIndex + 1;
  let j = rightIndex;
  const refIndex =
    leftIndex + Math.floor((rightIndex - leftIndex + 1) * Math.random());
  const ref = nums[refIndex];
  swap(nums, leftIndex, refIndex);

  while (i <= j) {
    while (i <= rightIndex && nums[i] < ref) {
      i++;
    }
    while (j >= leftIndex + 1 && nums[j] > ref) {
      j--;
    }

    if (i > j) {
      break;
    }
    swap(nums, i, j);
    i++;
    j--;
  }

  swap(nums, leftIndex, j);
  return j;
}

function usePartition(
  nums: number[],
  leftIndex: number,
  rightIndex: number,
  k: number
): number {
  const candidateIndex = partition(nums, leftIndex, rightIndex);
  if (rightIndex - candidateIndex + 1 === k) {
    return nums[candidateIndex];
  } else if (rightIndex - candidateIndex + 1 < k) {
    return usePartition(
      nums,
      leftIndex,
      candidateIndex - 1,
      k - (rightIndex - candidateIndex + 1)
    );
  } else {
    return usePartition(nums, candidateIndex + 1, rightIndex, k);
  }
}

function useHeap(nums: number[], k: number): number {
  const minHeap = new MaxHeap<number>((a, b) => b - a);
  for (let i = 0; i < nums.length; i++) {
    if (i < k) {
      minHeap.enqueue(nums[i]);
    } else {
      const min = minHeap.peek();
      if (nums[i] > min) {
        minHeap.dequeue();
        minHeap.enqueue(nums[i]);
      }
    }
  }

  return minHeap.dequeue();
}

export default findKthLargest;
