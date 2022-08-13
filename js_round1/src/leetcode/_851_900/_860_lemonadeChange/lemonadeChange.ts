// https://leetcode.com/problems/lemonade-change/

function lemonadeChange(bills: number[]): boolean {
  let fiveChangeNums = 0;
  let tenChangeNums = 0;

  for (const bill of bills) {
    if (bill === 5) {
      fiveChangeNums++;
    }
    if (bill === 10) {
      if (fiveChangeNums === 0) {
        return false;
      }
      tenChangeNums++;
      fiveChangeNums--;
    }

    if (bill === 20) {
      // [10, 5] or [5, 5, 5]
      if (tenChangeNums > 0 && fiveChangeNums > 0) {
        tenChangeNums--;
        fiveChangeNums--;
        continue;
      }
      if (fiveChangeNums < 3) {
        return false;
      } else {
        fiveChangeNums = fiveChangeNums - 3;
      }
    }
  }

  return true;
}

export default lemonadeChange;
