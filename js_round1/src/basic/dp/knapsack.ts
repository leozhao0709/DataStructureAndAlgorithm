// // 0 1 ksnapsack
// const knapsack = (weights: number[], values: number[], capacity: number) => {
//   weights = [0, ...weights];
//   values = [0, ...values];

//   const maxValuesTable = Array.from({ length: weights.length }, () => 0).map(
//     () => Array.from({ length: capacity + 1 }, () => 0)
//   );

//   for (let i = 1; i < weights.length; i++) {
//     for (let j = 0; j <= capacity; j++) {
//       if (j < weights[i]) {
//         maxValuesTable[i][j] = maxValuesTable[i - 1][j];
//       } else {
//         maxValuesTable[i][j] = Math.max(
//           maxValuesTable[i - 1][j],
//           maxValuesTable[i - 1][j - weights[i]] + values[i]
//         );
//       }
//     }
//   }

//   console.log(maxValuesTable);
//   return maxValuesTable[weights.length - 1][capacity];
// };

const knapsack = (weights: number[], values: number[], capacity: number) => {
  weights = [0, ...weights];
  values = [0, ...values];

  const maxValuesTable = Array.from({ length: weights.length }, () => 0).map(
    () =>
      Array.from({ length: capacity + 1 }, () => ({
        maxValue: 0,
        result: Array.from({ length: weights.length }, () => 0),
      }))
  );

  for (let i = 1; i < weights.length; i++) {
    for (let j = 0; j <= capacity; j++) {
      if (j < weights[i]) {
        maxValuesTable[i][j] = maxValuesTable[i - 1][j];
      } else {
        if (
          maxValuesTable[i - 1][j].maxValue >
          maxValuesTable[i - 1][j - weights[i]].maxValue + values[i]
        ) {
          maxValuesTable[i][j] = maxValuesTable[i - 1][j];
        } else {
          const result = [...maxValuesTable[i - 1][j - weights[i]].result];
          result[i] = 1;

          maxValuesTable[i][j] = {
            maxValue:
              maxValuesTable[i - 1][j - weights[i]].maxValue + values[i],
            result,
          };
        }
      }
    }
  }

  // console.log(JSON.stringify(maxValuesTable, null, 2));

  //clean up the edge 0 for result
  for (let i = 0; i < maxValuesTable.length; i++) {
    for (let j = 0; j < maxValuesTable[0].length; j++) {
      const { maxValue, result } = maxValuesTable[i][j];
      maxValuesTable[i][j] = {
        maxValue,
        result: result.slice(1),
      };
    }
  }

  return maxValuesTable[weights.length - 1][capacity];
};

const weights = [3, 2, 1, 5];
const values = [200, 150, 80, 160];
const capacity = 10;
const maxValue = knapsack(weights, values, capacity);
console.log(maxValue);
