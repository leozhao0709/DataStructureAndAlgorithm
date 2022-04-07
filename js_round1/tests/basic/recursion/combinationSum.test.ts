import combinationSum from '@app/basic/recursion/combinationSum';

describe('combinationSum', () => {
  it('should return correct result when candidates = [2,3,6,7], target = 7', () => {
    const candidates = [2, 3, 6, 7];
    const target = 7;
    expect(combinationSum(candidates, target)).toEqual([[2, 2, 3], [7]]);
  });

  it('should return correct result when candidates = [2,3,5], target = 8', () => {
    const candidates = [2, 3, 5];
    const target = 8;
    expect(combinationSum(candidates, target)).toEqual([
      [2, 2, 2, 2],
      [2, 3, 3],
      [3, 5],
    ]);
  });

  it('should return correct result when candidates = [2], target = 1', () => {
    const candidates = [2];
    const target = 1;
    expect(combinationSum(candidates, target)).toEqual([]);
  });
});
