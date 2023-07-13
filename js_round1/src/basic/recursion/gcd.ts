// https://www.jianshu.com/p/6eee7a14d61b demonstration
// greatest common divisor
const gcd = (a: number, b: number): number => {
  // a should be the large number
  if (a < b) {
    [b, a] = [a, b];
  }

  return b === 0 ? a : gcd(b, a % b);
};

// lowest common multiple (最小公倍数)
const lcm = (a: number, b: number): number => {
  return (a * b) / gcd(a, b);
};

console.log(gcd(3, 2));
console.log(gcd(3, 6));
console.log(gcd(15, 5));

console.log(lcm(3, 2));
console.log(lcm(3, 6));
console.log(lcm(15, 5));
