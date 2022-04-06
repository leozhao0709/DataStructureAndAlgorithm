import grayCode from '@app/basic/array/grayCode';

describe('grayCode', () => {
  it('should return correct value when n=1', () => {
    expect(grayCode(1)).toEqual([0, 1]);
  });

  it('should return correct value when n=2', () => {
    expect(grayCode(2)).toEqual([0, 1, 3, 2]);
  });
});
