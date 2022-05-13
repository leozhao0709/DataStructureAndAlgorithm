import quickSort, { partition } from '@app/basic/sort/quickSort';

describe('quickSort', () => {
  it('should sort correctly', () => {
    const arr = [9, 6, 5, 7, 10, 89, 100];
    quickSort(arr);
    console.log(arr);
    expect(arr).toEqual([5, 6, 7, 9, 10, 89, 100]);
  });

  it('should partition correctly', () => {
    const arr = [5, 6, 7, 9, 10, 89, 100];
    const index = partition(arr, 0, arr.length - 1);
    expect(index).toBe(0);
  });
});
