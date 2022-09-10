function myPow(x: number, n: number): number {
  const cache = new Map<number, number>();

  return myPowHelper(x, n, cache);
}

function myPowHelper(x: number, n: number, cache: Map<number, number>): number {
  if (n === 0) {
    return 1;
  }

  if (n === 1) {
    return x;
  }

  if (cache.has(n)) {
    return cache.get(n)!;
  }

  if (n > 1) {
    if (n % 2 === 0) {
      const sqrt = myPow(x, n / 2);
      cache.set(n / 2, sqrt);
      return sqrt * sqrt;
    } else {
      const temp = myPow(x, n - 1);
      cache.set(n - 1, temp);
      return x * temp;
    }
  }

  return myPow(1 / x, -n);
}
