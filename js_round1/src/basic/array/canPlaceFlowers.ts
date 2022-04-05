// https://leetcode.com/problems/can-place-flowers/

// function canPlaceFlowers(flowerbed: number[], n: number): boolean {
//   let placeCount = 0;

//   const flowerbeds = [0, ...flowerbed, 0];
//   for (let i = 1; i < flowerbeds.length - 1; i++) {
//     if (
//       flowerbeds[i] === 0 &&
//       flowerbeds[i - 1] === 0 &&
//       flowerbeds[i + 1] === 0
//     ) {
//       placeCount++;
//       i++;
//     }
//   }

//   return placeCount >= n;
// }

function canPlaceFlowers(flowerbed: number[], n: number): boolean {
  let placeCount = 0;

  for (let i = 0; i < flowerbed.length; i++) {
    if (
      (i === 0 || flowerbed[i - 1] === 0) &&
      flowerbed[i] === 0 &&
      (i + 1 === flowerbed.length || flowerbed[i + 1] === 0)
    ) {
      placeCount++;
      i++;
    }
  }

  return placeCount >= n;
}

export default canPlaceFlowers;
