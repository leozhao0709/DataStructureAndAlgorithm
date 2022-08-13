import lengthOfLongestSubstring from '@app/leetcode/_1_50/_3_lengthOfLongestSubstring/lengthOfLongestSubstring';

describe('03 lengthOfLongestSubstring', () => {
  it('should return 5 when string="tmmzuxt"', () => {
    const s = 'tmmzuxt';
    expect(lengthOfLongestSubstring(s)).toBe(5);
  });
});
