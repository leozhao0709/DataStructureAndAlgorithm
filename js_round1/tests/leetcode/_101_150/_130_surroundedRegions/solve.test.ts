import solve from '@app/leetcode/_101_150/_130_surroundedRegions/solve';

describe('130 surrounded regions', () => {
  it('should return correct result', () => {
    const board = [
      ['X', 'O', 'X', 'X'],
      ['O', 'X', 'O', 'X'],
      ['X', 'O', 'X', 'O'],
      ['O', 'X', 'O', 'X'],
    ];
    const expected = [
      ['X', 'O', 'X', 'X'],
      ['O', 'X', 'X', 'X'],
      ['X', 'X', 'X', 'O'],
      ['O', 'X', 'O', 'X'],
    ];

    solve(board);
    expect(board).toEqual(expected);
  });

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

  it(`should return [["X"]] when board = [["X"]]`, () => {
    const board = [['X']];
    solve(board);
    expect(board).toEqual([['X']]);
  });

  it('should return correct result', () => {
    const board = [
      ['O', 'O', 'O', 'O', 'X', 'X'],
      ['O', 'O', 'O', 'O', 'O', 'O'],
      ['O', 'X', 'O', 'X', 'O', 'O'],
      ['O', 'X', 'O', 'O', 'X', 'O'],
      ['O', 'X', 'O', 'X', 'O', 'O'],
      ['O', 'X', 'O', 'O', 'O', 'O'],
    ];
    const expected = [
      ['O', 'O', 'O', 'O', 'X', 'X'],
      ['O', 'O', 'O', 'O', 'O', 'O'],
      ['O', 'X', 'O', 'X', 'O', 'O'],
      ['O', 'X', 'O', 'O', 'X', 'O'],
      ['O', 'X', 'O', 'X', 'O', 'O'],
      ['O', 'X', 'O', 'O', 'O', 'O'],
    ];

    solve(board);
    expect(board).toEqual(expected);
  });

  it('should return correct result', () => {
    const board = [
      ['O', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O'],
      ['O', 'O', 'O', 'X', 'O', 'O', 'O', 'O', 'X'],
      ['O', 'X', 'O', 'X', 'O', 'O', 'O', 'O', 'X'],
      ['O', 'O', 'O', 'O', 'X', 'O', 'O', 'O', 'O'],
      ['X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'X'],
      ['X', 'X', 'O', 'O', 'X', 'O', 'X', 'O', 'X'],
      ['O', 'O', 'O', 'X', 'O', 'O', 'O', 'O', 'O'],
      ['O', 'O', 'O', 'X', 'O', 'O', 'O', 'O', 'O'],
      ['O', 'O', 'O', 'O', 'O', 'X', 'X', 'O', 'O'],
    ];
    const expected = [
      ['O', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O'],
      ['O', 'O', 'O', 'X', 'O', 'O', 'O', 'O', 'X'],
      ['O', 'X', 'O', 'X', 'O', 'O', 'O', 'O', 'X'],
      ['O', 'O', 'O', 'O', 'X', 'O', 'O', 'O', 'O'],
      ['X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'X'],
      ['X', 'X', 'O', 'O', 'X', 'O', 'X', 'O', 'X'],
      ['O', 'O', 'O', 'X', 'O', 'O', 'O', 'O', 'O'],
      ['O', 'O', 'O', 'X', 'O', 'O', 'O', 'O', 'O'],
      ['O', 'O', 'O', 'O', 'O', 'X', 'X', 'O', 'O'],
    ];

    solve(board);
    expect(board).toEqual(expected);
  });

  it('should return correct result', () => {
    const board = [
      ['O', 'X', 'X', 'X', 'X', 'X', 'O', 'O'],
      ['O', 'O', 'O', 'X', 'X', 'X', 'X', 'O'],
      ['X', 'X', 'X', 'X', 'O', 'O', 'O', 'O'],
      ['X', 'O', 'X', 'O', 'O', 'X', 'X', 'X'],
      ['O', 'X', 'O', 'X', 'X', 'X', 'O', 'O'],
      ['O', 'X', 'X', 'O', 'O', 'X', 'X', 'O'],
      ['O', 'X', 'O', 'X', 'X', 'X', 'O', 'O'],
      ['O', 'X', 'X', 'X', 'X', 'O', 'X', 'X'],
    ];
    const expected = [
      ['O', 'X', 'X', 'X', 'X', 'X', 'O', 'O'],
      ['O', 'O', 'O', 'X', 'X', 'X', 'X', 'O'],
      ['X', 'X', 'X', 'X', 'O', 'O', 'O', 'O'],
      ['X', 'X', 'X', 'O', 'O', 'X', 'X', 'X'],
      ['O', 'X', 'X', 'X', 'X', 'X', 'O', 'O'],
      ['O', 'X', 'X', 'X', 'X', 'X', 'X', 'O'],
      ['O', 'X', 'X', 'X', 'X', 'X', 'O', 'O'],
      ['O', 'X', 'X', 'X', 'X', 'O', 'X', 'X'],
    ];

    solve(board);
    expect(board).toEqual(expected);
  });
});
