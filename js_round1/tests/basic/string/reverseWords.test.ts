import reverseWord from '@app/basic/string/reverseWords';
describe('reverseWords', () => {
  it('should return correct reverse', () => {
    let str = `Let's take LeetCode contest`;
    expect(reverseWord(str)).toBe(`s'teL ekat edoCteeL tsetnoc`);

    str = `God Ding`;
    expect(reverseWord(str)).toBe(`doG gniD`);
  });
});
