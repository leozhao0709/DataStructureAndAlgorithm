function isValid(s: string): boolean {
  if (s.length % 2 !== 0) {
    return false;
  }

  const parentheses = {
    ')': '(',
    ']': '[',
    '}': '{',
  };

  const leftParentheses = Object.values(parentheses);
  const stack: string[] = [];
  for (const char of s) {
    if (leftParentheses.includes(char)) {
      stack.push(char);
    } else if (stack.pop() !== parentheses[char]) {
      return false;
    }
  }

  return stack.length === 0;
}

export default isValid;
