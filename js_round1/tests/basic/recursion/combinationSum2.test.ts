import combinationSum2 from '@app/basic/recursion/combinationSum2';

describe('combinationSum2', () => {
  it('should return correct result when candidates = [10,1,2,7,6,1,5], target = 8', () => {
    const candidates = [10, 1, 2, 7, 6, 1, 5];
    const target = 8;
    expect(combinationSum2(candidates, target)).toEqual([
      [1, 1, 6],
      [1, 2, 5],
      [1, 7],
      [2, 6],
    ]);
  });

  it('should return correct result when candidates = [2,5,2,1,2], target = 5', () => {
    const candidates = [2, 5, 2, 1, 2];
    const target = 5;
    expect(combinationSum2(candidates, target)).toEqual([[1, 2, 2], [5]]);
  });
});
