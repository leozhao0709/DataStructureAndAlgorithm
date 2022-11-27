// https://leetcode.com/problems/random-pick-with-weight/

class RandomWeightPick {
  private pickArray: number[];

  constructor(w: number[]) {
    const sum = w.reduce((prev, curr) => prev + curr);
    this.pickArray = new Array(sum).fill(0);
    let k = 0;
    w.forEach((weight, i) => {
      for (let j = 0; j < weight; j++) {
        this.pickArray[k] = i;
        k++;
      }
    });
  }

  pickIndex(): number {
    const randomIndex = Math.floor(Math.random() * this.pickArray.length);
    return this.pickArray[randomIndex];
  }
}
