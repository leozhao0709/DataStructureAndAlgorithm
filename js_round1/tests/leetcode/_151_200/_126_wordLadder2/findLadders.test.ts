import findLadders from '@app/leetcode/_101_150/_126_wordLadder2/findLadders';

describe('leetcode 126 word ladder1', () => {
  it(`should return [["hit","hot","dot","dog","cog"],["hit","hot","lot","log","cog"]] when beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]`, () => {
    const beginWord = 'hit';
    const endWord = 'cog';
    const wordList = ['hot', 'dot', 'dog', 'lot', 'log', 'cog'];

    expect(findLadders(beginWord, endWord, wordList)).toEqual([
      ['hit', 'hot', 'dot', 'dog', 'cog'],
      ['hit', 'hot', 'lot', 'log', 'cog'],
    ]);
  });

  it(`should return [] when beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]`, () => {
    const beginWord = 'hit';
    const endWord = 'cog';
    const wordList = ['hot', 'dot', 'dog', 'lot', 'log'];

    expect(findLadders(beginWord, endWord, wordList)).toEqual([]);
  });
});
