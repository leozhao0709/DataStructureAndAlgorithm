import { getRandomArray } from '../../src/utils/getArray';
import { MinHeap } from '../../src/heap/minHeap';
const n = 13;
const arr1 = getRandomArray(n, 0, n);

const minHeap = new MinHeap();

for (const value of arr1) {
  minHeap.insertItem(value);
}

while (!minHeap.isEmpty()) {
  console.log(minHeap.extractMin());
}
