class LRUCache {
  private map: Map<number, number> = new Map();

  constructor(private capacity: number) {
    this.capacity = capacity;
  }

  get(key: number): number {
    if (this.map.has(key)) {
      const value = this.map.get(key)!;
      this.map.delete(key);
      this.map.set(key, value);
      return value;
    }
    return -1;
  }

  put(key: number, value: number): void {
    if (this.map.has(key)) {
      this.map.delete(key);
      this.map.set(key, value);
      return;
    }

    if (this.map.size < this.capacity) {
      this.map.set(key, value);
      return;
    }

    const LRUKey = this.map.keys().next().value as number;
    this.map.delete(LRUKey);
    this.map.set(key, value);
  }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * var obj = new LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */

// test

const lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
let value = lRUCache.get(1); // return 1
console.log(value);
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}

value = lRUCache.get(2); // returns -1 (not found)
console.log(value);
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
value = lRUCache.get(1); // return -1 (not found)
console.log(value);
value = lRUCache.get(3); // return 3
console.log(value);
value = lRUCache.get(4); // return 4
console.log(value);
