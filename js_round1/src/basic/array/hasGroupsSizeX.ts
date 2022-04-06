// https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/

function hasGroupsSizeX(deck: number[]): boolean {
  const map = new Map<number, number>();

  deck.forEach((card) => {
    const cardCount = map.get(card) || 0;
    map.set(card, cardCount + 1);
  });

  const gcd = (a: number, b: number) => {
    return b > 0 ? gcd(b, a % b) : a;
  };

  let gcdRes = 0;
  for (const value of map.values()) {
    gcdRes = gcd(gcdRes, value);
  }

  return gcdRes > 1;
}

export default hasGroupsSizeX;
