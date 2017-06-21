import { getRandomArray } from '../../src/utils/getArray';
import { MaxHeap } from '../../src/heap/maxHeap';
const n = 13;
const arr1 = getRandomArray(n, 0, n);

const maxHeap = new MaxHeap();

for (const value of arr1) {
  maxHeap.insertItem(value);
}

while (!maxHeap.isEmpty()) {
  console.log(maxHeap.extractMax());
}
