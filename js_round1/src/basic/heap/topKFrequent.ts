import { MaxHeap } from './MaxHeap';

// https://leetcode.com/problems/top-k-frequent-elements/
function topKFrequent(nums: number[], k: number): number[] {
  const map = new Map<number, number>();
  nums.forEach((num) => {
    if (!map.has(num)) {
      map.set(num, 0);
    }
    map.set(num, map.get(num)! + 1);
  });

  const array: [number, number][] = [];
  for (const entry of map) {
    array.push(entry);
  }

  console.log(array);
  const maxHeap = new MaxHeap<[number, number]>((a, b) => a[1] - b[1], array);

  const res: number[] = [];

  for (let i = 0; i < k; i++) {
    res.push(maxHeap.dequeue()[0]);
  }
  return res;
}

export default topKFrequent;

// test

const nums = [5, 3, 1, 1, 1, 3, 73, 1],
  k = 2;
console.log(topKFrequent(nums, k));
