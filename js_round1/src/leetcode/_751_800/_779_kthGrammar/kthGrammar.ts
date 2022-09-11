function kthGrammar(n: number, k: number): number {
  if (n === 1 && k === 1) {
    return 0;
  }

  const kIsOdd = k % 2 === 1 ? true : false;

  const kGeneratedBy = kthGrammar(n - 1, Math.ceil(k / 2));

  if (kGeneratedBy === 0) {
    return kIsOdd ? 0 : 1;
  } else {
    return kIsOdd ? 1 : 0;
  }
}
