import { MaxHeap } from '@app/basic/heap/MaxHeap';
// https://leetcode.com/problems/kth-largest-element-in-an-array/
function findKthLargest(nums: number[], k: number): number {
  return useHeap(nums, k);
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
