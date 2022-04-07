import selectSort from '@app/basic/sort/selectSort';

describe('select sort', () => {
  it('should sort correctly', () => {
    const arr = [9, 6, 5, 7, 10, 89, 100];
    selectSort(arr);
    expect(arr).toEqual([5, 6, 7, 9, 10, 89, 100]);
  });
});
