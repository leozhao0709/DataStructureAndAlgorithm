import maxSumInTriangle from '@app/basic/recursion/maxSumInTriangle';
describe('maxSumInTriangle', () => {
  it('should work with simple triangle', () => {
    const triangle = [
      [1, 0, 0],
      [2, 3, 0],
      [4, 5, 6],
    ];

    expect(maxSumInTriangle(triangle, { x: 0, y: 0 })).toBe(10);
    expect(maxSumInTriangle(triangle, { x: 1, y: 0 })).toBe(7);
  });

  it('should work with complex triangle', () => {
    const triangle = [
      [7, 0, 0, 0, 0],
      [3, 8, 0, 0, 0],
      [8, 1, 0, 0, 0],
      [2, 7, 4, 4, 0],
      [4, 5, 2, 6, 5],
    ];

    expect(maxSumInTriangle(triangle, { x: 0, y: 0 })).toBe(30);
    expect(maxSumInTriangle(triangle, { x: 1, y: 1 })).toBe(21);
  });
});
