import isValid from '@app/basic/stack/validParentheses';

describe('validParentheses', () => {
  it('should return true when s is "()"', () => {
    expect(isValid('()')).toBeTruthy();
  });

  it('should return true when s is "()[]{}"', () => {
    expect(isValid('()[]{}')).toBeTruthy();
  });

  it('should return true when s is "(]"', () => {
    expect(isValid('(]')).toBeFalsy();
  });
});
