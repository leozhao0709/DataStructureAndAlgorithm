import ladderLength from '@app/leetcode/_101_150/_127_wordLadder1/ladderLength';

describe('leetcode 127 word ladder2', () => {
  it(`should return 5 when beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]`, () => {
    const beginWord = 'hit';
    const endWord = 'cog';
    const wordList = ['hot', 'dot', 'dog', 'lot', 'log', 'cog'];

    expect(ladderLength(beginWord, endWord, wordList)).toEqual(5);
  });

  it(`should return 0 when beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]`, () => {
    const beginWord = 'hit';
    const endWord = 'cog';
    const wordList = ['hot', 'dot', 'dog', 'lot', 'log'];

    expect(ladderLength(beginWord, endWord, wordList)).toEqual(0);
  });
});
