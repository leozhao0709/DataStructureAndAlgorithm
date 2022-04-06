import hasGroupsSizeX from '@app/basic/array/hasGroupsSizeX';
describe('hasGroupsSizeX', () => {
  it('should return true when deck is [1,2,3,4,4,3,2,1]', () => {
    const deck = [1, 2, 3, 4, 4, 3, 2, 1];
    expect(hasGroupsSizeX(deck)).toBe(true);
  });

  it('should return false when deck is [1,1,1,2,2,2,3,3]', () => {
    const deck = [1, 1, 1, 2, 2, 2, 3, 3];
    expect(hasGroupsSizeX(deck)).toBe(false);
  });

  it('should return false when deck is [1,1,1,1,2,2,2,2,2,2]', () => {
    const deck = [1, 1, 1, 1, 2, 2, 2, 2, 2, 2];
    expect(hasGroupsSizeX(deck)).toBe(true);
  });

  it('should return false when deck is [1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3]', () => {
    const deck = [
      1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3,
    ];
    expect(hasGroupsSizeX(deck)).toBe(false);
  });
});
