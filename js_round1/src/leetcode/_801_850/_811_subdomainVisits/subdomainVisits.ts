// https://leetcode.com/problems/subdomain-visit-count/

function subdomainVisits(cpdomains: string[]): string[] {
  const res: string[] = [];

  const map = new Map<string, number>();

  cpdomains.forEach((cpdomain) => {
    countDomain(cpdomain, map);
  });

  for (const [key, val] of map) {
    res.push(`${val} ${key}`);
  }

  return res;
}

function countDomain(cpdomain: string, map: Map<string, number>) {
  const [count, domain] = cpdomain.split(' ');

  const subdomains = domain.split('.');
  const subLength = subdomains.length;
  let tempDomain = '';
  for (let i = subLength - 1; i >= 0; i--) {
    const subdomain =
      subdomains[i] + `${i === subLength - 1 ? '' : '.'}` + tempDomain;
    tempDomain = subdomain;
    if (map.has(subdomain)) {
      map.set(subdomain, map.get(subdomain)! + parseInt(count));
    } else {
      map.set(subdomain, parseInt(count));
    }
  }
}
