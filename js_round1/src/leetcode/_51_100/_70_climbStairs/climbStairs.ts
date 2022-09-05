function climbStairs(n: number): number {
  const mem = new Array(n + 1).fill(0);
  mem[1] = 1;
  mem[2] = 2;
  for (let i = 3; i < n + 1; i++) {
    mem[i] = mem[i - 1] + mem[i - 2];
  }

  return mem[n];
}
