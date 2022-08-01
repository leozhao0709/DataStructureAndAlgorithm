import solve from '@app/leetcode/_101_150/_130_surroundedRegions/solve';

describe('130 surrounded regions', () => {
  it('should return correct result', () => {
    const board = [
      ['O', 'O', 'O'],
      ['O', 'O', 'O'],
      ['O', 'O', 'O'],
    ];
    const expected = [
      ['O', 'O', 'O'],
      ['O', 'O', 'O'],
      ['O', 'O', 'O'],
    ];

    solve(board);
    console.log(board);
    expect(board).toEqual(expected);
  });

  it('should return correct result', () => {
    const board = [
      ['X', 'X', 'X', 'X'],
      ['X', 'O', 'O', 'X'],
      ['X', 'X', 'O', 'X'],
      ['X', 'O', 'X', 'X'],
    ];
    const expected = [
      ['X', 'X', 'X', 'X'],
      ['X', 'X', 'X', 'X'],
      ['X', 'X', 'X', 'X'],
      ['X', 'O', 'X', 'X'],
    ];

    solve(board);
    expect(board).toEqual(expected);
  });

  xit(`should return [["X"]] when board = [["X"]]`, () => {
    const board = [['X']];
    solve(board);
    expect(board).toEqual([['X']]);
  });
});
