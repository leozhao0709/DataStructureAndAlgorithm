import isBipartite from '@app/leetcode/_751_800/_785_isBipartite/isBipartite';

describe('785 isBipartite', () => {
  it('should return false ,when graph = [[1,2,3],[0,2],[0,1,3],[0,2]]', () => {
    const graph = [
      [1, 2, 3],
      [0, 2],
      [0, 1, 3],
      [0, 2],
    ];
    expect(isBipartite(graph)).toBeFalsy();
  });

  it('should return true ,when graph = [[1,3],[0,2],[1,3],[0,2]]', () => {
    const graph = [
      [1, 3],
      [0, 2],
      [1, 3],
      [0, 2],
    ];
    expect(isBipartite(graph)).toBeTruthy();
  });
});
