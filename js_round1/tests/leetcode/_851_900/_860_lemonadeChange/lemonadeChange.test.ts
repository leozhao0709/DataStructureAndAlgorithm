import lemonadeChange from '@app/leetcode/_851_900/_860_lemonadeChange/lemonadeChange';

describe('860 - lemonadeChange', () => {
  it('should return true when bill = [5,5,5,10,20]', () => {
    const bills = [5, 5, 5, 10, 20];
    expect(lemonadeChange(bills)).toBeTruthy();
  });

  it('should return false when bill = [5,5,10,10,20]', () => {
    const bills = [5, 5, 10, 10, 20];
    expect(lemonadeChange(bills)).toBeFalsy();
  });
});
