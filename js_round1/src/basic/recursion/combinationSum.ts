// https://leetcode.com/problems/combination-sum/

// function combinationSum(candidates: number[], target: number): number[][] {
//   const result: number[][] = [];

//   const combinationHelper = (
//     candidates: number[],
//     target: number,
//     resultArr: number[]
//   ) => {
//     if (target < 0) {
//       return;
//     }

//     if (target === 0) {
//       result.push(resultArr);
//       return;
//     }

//     candidates.forEach((candidate) => {
//       const tempResultArr = [...resultArr, candidate];
//       combinationHelper(candidates, target - candidate, tempResultArr);
//       candidates = candidates.filter((v) => candidate !== v);
//     });
//   };

//   combinationHelper(candidates, target, []);
//   return result;
// }

function combinationSum(candidates: number[], target: number): number[][] {
  const result: number[][] = [];

  const combinationHelper = (
    candidates: number[],
    target: number,
    i: number,
    j: number,
    resultArr: number[]
  ) => {
    if (target < 0) {
      return;
    }

    if (target === 0) {
      result.push(resultArr);
      return;
    }

    for (let k = i; k <= j; k++) {
      const candidate = candidates[k];
      const tempResultArr = [...resultArr, candidate];
      combinationHelper(candidates, target - candidate, k, j, tempResultArr);
    }
  };

  combinationHelper(candidates, target, 0, candidates.length - 1, []);

  return result;
}

export default combinationSum;
