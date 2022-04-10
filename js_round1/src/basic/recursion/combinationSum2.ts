// https://leetcode.com/problems/combination-sum-ii/

// function combinationSum2(candidates: number[], target: number): number[][] {
//   const result: number[][] = [];
//   candidates.sort();

//   const combinationList = (
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

//     candidates.forEach((candidate, i) => {
//       if (i !== 0 && candidate === candidates[i - 1]) {
//         return;
//       }

//       const tempResultArr = [...resultArr, candidate];
//       combinationList(
//         candidates.slice(i + 1),
//         target - candidate,
//         tempResultArr
//       );
//     });
//   };

//   combinationList(candidates, target, []);

//   return result;
// }

function combinationSum2(candidates: number[], target: number): number[][] {
  const result: number[][] = [];
  candidates.sort();

  const combinationList = (
    candidates: number[],
    target: number,
    start: number,
    end: number,
    resultArr: number[]
  ) => {
    if (target < 0) {
      return;
    }

    if (target === 0) {
      result.push(resultArr);
      return;
    }

    for (let i = start; i <= end; i++) {
      const candidate = candidates[i];
      if (i !== start && candidate === candidates[i - 1]) {
        continue;
      }

      const tempResultArr = [...resultArr, candidate];
      combinationList(
        candidates,
        target - candidate,
        i + 1,
        end,
        tempResultArr
      );
    }
  };

  combinationList(candidates, target, 0, candidates.length - 1, []);

  return result;
}

export default combinationSum2;
