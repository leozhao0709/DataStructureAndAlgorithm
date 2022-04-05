import canPlaceFlowers from '@app/basic/array/canPlaceFlowers';
describe('canPlaceFlowers', () => {
  it('should return true when flowerbed = [1,0,0,0,1] and n = 1', () => {
    const flowerbed = [1, 0, 0, 0, 1];
    const n = 1;
    expect(canPlaceFlowers(flowerbed, n)).toBe(true);
  });

  it('should return false when flowerbed = [1,0,0,0,1] and n = 2', () => {
    const flowerbed = [1, 0, 0, 0, 1];
    const n = 2;
    expect(canPlaceFlowers(flowerbed, n)).toBe(false);
  });
});
