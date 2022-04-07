import sortArrayByParityII from '@app/basic/sort/sortArrayByParityII';

describe('sortArrayByParityII', () => {
  it('should return [4, 5, 2, 7] when nums is [4, 2, 5, 7]', () => {
    const nums = [4, 2, 5, 7];
    expect(sortArrayByParityII(nums)).toEqual([4, 5, 2, 7]);
  });

  it('should return [2, 3] when nums is [2, 3]', () => {
    const nums = [2, 3];
    expect(sortArrayByParityII(nums)).toEqual([2, 3]);
  });

  it('should return [4,1,0,1,0,1] when nums is [4,1,1,0,1,0]', () => {
    const nums = [4, 1, 1, 0, 1, 0];
    expect(sortArrayByParityII(nums)).toEqual([4, 1, 0, 1, 0, 1]);
  });
});
