import letterCombinations from '@app/basic/array/letterCombinations';

describe('letterCombinations', () => {
  it('should return [] when pass in empty string', () => {
    expect(letterCombinations('')).toEqual([]); // expect to false
  });

  it('should return a,b,c if digit is 2', () => {
    expect(letterCombinations('2')).toEqual(['a', 'b', 'c']);
  });

  it('should return correct value when digits is 23', () => {
    expect(letterCombinations('23')).toEqual([
      'ad',
      'ae',
      'af',
      'bd',
      'be',
      'bf',
      'cd',
      'ce',
      'cf',
    ]);
  });
});
