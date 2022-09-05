function countPrimes(n: number): number {
  if (n <= 2) {
    return 0;
  }

  const buckets: boolean[] = new Array(n).fill(false);
  for (let i = 2; i < Math.ceil(Math.sqrt(n)); i++) {
    if (!buckets[i]) {
      for (let j = i + i; j <= n; j = j + i) {
        buckets[j] = true;
      }
    }
  }

  let count = 0;
  for (let i = 2; i < n; i++) {
    if (!buckets[i]) {
      count++;
    }
  }

  return count;
}
