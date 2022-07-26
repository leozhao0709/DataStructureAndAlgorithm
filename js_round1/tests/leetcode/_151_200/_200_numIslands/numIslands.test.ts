import numIslands from '@app/leetcode/_151_200/_200_numIslands/numIslands';

describe('200 numIslands', () => {
  it('should return 1', () => {
    const grid = [
      ['1', '1', '1', '1', '0'],
      ['1', '1', '0', '1', '0'],
      ['1', '1', '0', '0', '0'],
      ['0', '0', '0', '0', '0'],
    ];
    expect(numIslands(grid)).toBe(1);
  });

  it('should return 3', () => {
    const grid = [
      ['1', '1', '0', '0', '0'],
      ['1', '1', '0', '0', '0'],
      ['0', '0', '1', '0', '0'],
      ['0', '0', '0', '1', '1'],
    ];
    expect(numIslands(grid)).toBe(3);
  });

  it('should return 4', () => {
    const grid = [
      ['0', '1', '0'],
      ['1', '0', '1'],
      ['0', '1', '0'],
    ];

    expect(numIslands(grid)).toBe(4);
  });
});
