// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

function maxProfit(prices: number[]): number {
  let i = 1;
  let j = 0;
  let maxProfit = 0;
  while (i < prices.length) {
    if (prices[i] < prices[i - 1]) {
      maxProfit += prices[i - 1] - prices[j];
      j = i;
    }
    i++;
  }

  if (prices[i - 1] > prices[j]) {
    maxProfit += prices[i - 1] - prices[j];
  }
  return maxProfit;
}
