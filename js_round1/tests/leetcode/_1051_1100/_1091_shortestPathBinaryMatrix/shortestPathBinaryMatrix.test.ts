import shortestPathBinaryMatrix from '@app/leetcode/_1051_1100/_1091_shortestPathBinaryMatrix/shortestPathBinaryMatrix';

describe('1091 https://leetcode.com/problems/shortest-path-in-binary-matrix/', () => {
  it('should return 2 when grid = [[0,1],[1,0]]', () => {
    const grid = [
      [0, 1],
      [1, 0],
    ];
    expect(shortestPathBinaryMatrix(grid)).toBe(2);
  });

  it('should return 4 when grid = [[0,0,0],[1,1,0],[1,1,0]]', () => {
    const grid = [
      [0, 0, 0],
      [1, 1, 0],
      [1, 1, 0],
    ];
    expect(shortestPathBinaryMatrix(grid)).toBe(4);
  });

  it('should return -1 when grid = [[1,0,0],[1,1,0],[1,1,0]]', () => {
    const grid = [
      [1, 0, 0],
      [1, 1, 0],
      [1, 1, 0],
    ];
    expect(shortestPathBinaryMatrix(grid)).toBe(-1);
  });

  it('should return -1 when grid = [[0,0,0],[1,1,0],[1,1,1]]', () => {
    const grid = [
      [0, 0, 0],
      [1, 1, 0],
      [1, 1, 1],
    ];
    expect(shortestPathBinaryMatrix(grid)).toBe(-1);
  });

  it('should return 1 when grid = [[0]]', () => {
    const grid = [[0]];
    expect(shortestPathBinaryMatrix(grid)).toBe(1);
  });
});
