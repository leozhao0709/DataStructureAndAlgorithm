// https://leetcode.com/problems/implement-trie-prefix-tree/

// interface TrieNode {
//   isWord: boolean;
//   next: Map<string, TrieNode>;
// }

// class Trie {
//   private readonly root: TrieNode;

//   constructor() {
//     this.root = {
//       isWord: false,
//       next: new Map(),
//     };
//   }

//   insert(word: string): void {
//     let curr: TrieNode = this.root;
//     for (let i = 0; i < word.length; i++) {
//       const char = word.charAt(i);
//       if (!curr.next.has(char)) {
//         curr.next.set(char, { isWord: false, next: new Map() });
//       }
//       curr = curr.next.get(char)!;
//     }

//     if (!curr?.isWord) {
//       curr.isWord = true;
//     }
//   }

//   search(word: string): boolean {
//     let curr = this.root;
//     for (let i = 0; i < word.length; i++) {
//       const char = word.charAt(i);
//       if (!curr.next.has(char)) {
//         return false;
//       }
//       curr = curr.next.get(char)!;
//     }

//     return curr.isWord;
//   }

//   startsWith(prefix: string): boolean {
//     let curr = this.root;
//     for (let i = 0; i < prefix.length; i++) {
//       const char = prefix.charAt(i);
//       if (!curr.next.has(char)) {
//         return false;
//       }
//       curr = curr.next.get(char)!;
//     }

//     return true;
//   }
// }

class TrieNode {
  constructor(
    public currWord: string | undefined = undefined,
    public isWord = false,
    public next: Map<string, TrieNode> | undefined = undefined
  ) {}
}

class Trie {
  private root: TrieNode;

  constructor() {
    this.root = new TrieNode();
  }

  insert(word: string): void {
    let curr = this.root;
    for (const char of word) {
      if (curr.next === undefined) {
        curr.next = new Map();
      }
      if (!curr.next.has(char)) {
        curr.next.set(char, new TrieNode(char));
      }
      curr = curr.next.get(char)!;
    }

    curr.isWord = true;
  }

  search(word: string): boolean {
    let curr = this.root;
    for (const char of word) {
      if (curr.next === undefined || !curr.next.has(char)) {
        return false;
      }
      curr = curr.next.get(char)!;
    }
    return curr.isWord;
  }

  startsWith(prefix: string): boolean {
    let curr = this.root;
    for (const char of prefix) {
      if (curr.next === undefined || !curr.next.has(char)) {
        return false;
      }
      curr = curr.next.get(char)!;
    }
    return true;
  }
}

// test
const trie = new Trie();
trie.insert('app');
trie.insert('apple');
trie.insert('beer');
trie.insert('add');
trie.insert('jam');
trie.insert('rental');
console.log(trie.search('apps'));
console.log(trie.search('app'));
