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

  it(`should return [["red","ted","tad","tax"],["red","ted","tex","tax"],["red","rex","tex","tax"]] when beginWord = "red", endWord = "tax", wordList = ["ted","tex","red","tax","tad","den","rex","pee"]`, () => {
    const beginWord = 'red';
    const endWord = 'tax';
    const wordList = ['ted', 'tex', 'red', 'tax', 'tad', 'den', 'rex', 'pee'];

    expect(findLadders(beginWord, endWord, wordList)).toEqual([
      ['red', 'ted', 'tad', 'tax'],
      ['red', 'ted', 'tex', 'tax'],
      ['red', 'rex', 'tex', 'tax'],
    ]);
  });
});
