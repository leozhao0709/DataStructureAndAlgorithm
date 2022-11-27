class ShuffleArray {
  private readonly originalArr: number[];

  constructor(nums: number[]) {
    this.originalArr = nums;
  }

  reset(): number[] {
    return this.originalArr;
  }

  shuffle(): number[] {
    const arr = [...this.originalArr];
    const n = arr.length;
    for (let i = 0; i < n; i++) {
      const nextRandIndex = Math.floor(Math.random() * (n - i)) + i;
      this.swap(arr, i, nextRandIndex);
    }
    return arr;
  }

  private swap(arr: number[], i: number, j: number) {
    const temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
