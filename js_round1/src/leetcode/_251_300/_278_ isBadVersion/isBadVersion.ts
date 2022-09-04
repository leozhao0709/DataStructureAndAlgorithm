/**
 * The knows API is defined in the parent class Relation.
 * isBadVersion(version: number): boolean {
 *     ...
 * };
 */

const solution = function (isBadVersion: any) {
  return function (n: number): number {
    const findBadVersion = (start: number, end: number): number | null => {
      if (start > end) {
        return null;
      }

      const mid = start + Math.floor((end - start) / 2);
      if (isBadVersion(mid)) {
        const candidateVersion = findBadVersion(start, mid - 1);
        if (candidateVersion === null) {
          return mid;
        }
        return findBadVersion(start, candidateVersion);
      } else {
        return findBadVersion(mid + 1, end);
      }
    };

    return findBadVersion(1, n)!;
  };
};
