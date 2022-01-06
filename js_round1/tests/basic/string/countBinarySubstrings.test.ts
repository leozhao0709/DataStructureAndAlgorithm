import countBinarySubstrings from '@app/basic/string/countBinarySubstrings';
describe('countBinarySubstrings', () => {
  it('shoud match leetcode example', () => {
    let s = '00110011';
    expect(countBinarySubstrings(s)).toBe(6);

    s = '10101';
    expect(countBinarySubstrings(s)).toBe(4);
  });

  it('00110 should return 3', () => {
    const s = '00110';
    expect(countBinarySubstrings(s)).toBe(3);
  });

  it('100 should return 2', () => {
    const s = '100';
    expect(countBinarySubstrings(s)).toBe(1);
  });
});
