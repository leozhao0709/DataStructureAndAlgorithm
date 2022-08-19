// https://leetcode.com/problems/single-number/

function singleNumber(nums: number[]): number {
  const map = new Map<number, number>();

  for (const num of nums) {
    if (map.has(num)) {
      map.delete(num);
    } else {
      map.set(num, 1);
    }
  }

  return map.keys().next().value;
}
