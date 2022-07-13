import topKFrequent from '@app/basic/heap/topKFrequent';

describe('topKFrequent', () => {
  it('should return [1, 2] when nums = [1,1,1,2,2,3], k = 2', () => {
    const nums = [1, 1, 1, 2, 2, 3];
    const k = 2;
    const res = topKFrequent(nums, k);
    expect(res).toEqual([1, 2]);
  });

  it('should return [1] when nums = [1], k = 1', () => {
    const nums = [1];
    const k = 1;
    const res = topKFrequent(nums, k);
    expect(res).toEqual([1]);
  });
});
