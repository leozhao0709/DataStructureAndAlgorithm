function fib(n: number): number {
  if (n === 0 || n === 1) {
    return n;
  }

  let prev1 = 0;
  let prev2 = 1;
  let curr = 0;
  for (let i = 2; i <= n; i++) {
    curr = prev1 + prev2;
    prev2 = prev1;
    prev1 = curr;
  }

  return curr;
}
