// https://leetcode.com/problems/intersection-of-two-arrays-ii/

function intersect(nums1: number[], nums2: number[]): number[] {
  const map = new Map<number, number>();

  for (const num of nums1) {
    if (!map.has(num)) {
      map.set(num, 0);
    }
    map.set(num, map.get(num)! + 1);
  }

  const result: number[] = [];
  for (const num of nums2) {
    if (map.has(num)) {
      const count = map.get(num)!;
      result.push(num);
      if (count - 1 === 0) {
        map.delete(num);
      } else {
        map.set(num, count - 1);
      }
    }
  }

  return result;
}
