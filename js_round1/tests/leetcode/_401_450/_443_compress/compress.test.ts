import compress from '@app/leetcode/_401_450/_443_compress/compress';

describe('443 string compression', () => {
  it(`should return 6 when chars are ["a","a","b","b","c","c","c"]`, () => {
    const chars = ['a', 'a', 'b', 'b', 'c', 'c', 'c'];
    const result = compress(chars);
    expect(result).toBe(6);
    expect(chars.slice(0, 6).join('')).toBe('a2b2c3');
  });

  it(`should return 1 when chars are ["a"]`, () => {
    const chars = ['a'];
    const result = compress(chars);
    expect(result).toBe(1);
    expect(chars.slice(0, 1).join('')).toBe('a');
  });

  it(`should return 6 when chars are ["a","b","b","b","b","b","b","b","b","b","b","b","b"]`, () => {
    const chars = [
      'a',
      'b',
      'b',
      'b',
      'b',
      'b',
      'b',
      'b',
      'b',
      'b',
      'b',
      'b',
      'b',
    ];
    const result = compress(chars);
    expect(result).toBe(4);
    expect(chars.slice(0, 4).join('')).toBe('ab12');
  });
});
