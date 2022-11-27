// https://leetcode.com/problems/text-justification/
function fullJustify(words: string[], maxWidth: number): string[] {
  const res: string[] = [];

  const wordsLength = words.length;

  let currentLine = '';
  for (let i = 0; i < wordsLength; i++) {
    if (currentLine.length + words[i].length > maxWidth) {
      currentLine = currentLine.substring(0, currentLine.length - 1);
      const line = formatNormalLine(currentLine, maxWidth);
      res.push(line);
      currentLine = `${words[i]} `;
    } else if (currentLine.length + words[i].length === maxWidth) {
      const line = currentLine + words[i];
      res.push(line);
      currentLine = '';
    } else {
      currentLine += `${words[i]} `;
    }
  }

  if (currentLine.length > 0) {
    res.push(
      formatLastLine(currentLine.substring(0, currentLine.length - 1), maxWidth)
    );
  }

  return res;
}

function formatLastLine(line: string, maxWidth: number): string {
  const extraSpaceNeed = maxWidth - line.length;
  return line + new Array(extraSpaceNeed).fill(' ').join('');
}

function formatNormalLine(line: string, maxWidth: number): string {
  if (line.length === maxWidth) {
    return line;
  }

  let words = line.split(' ');

  if (words.length === 1) {
    return words + new Array(maxWidth - words[0].length).fill(' ').join('');
  }

  const spaceNeed = maxWidth - line.replace(/\s/g, '').length;

  const maxSpaceBtween = new Array(Math.floor(spaceNeed / (words.length - 1)))
    .fill(' ')
    .join('');

  words = words.map((word, i) => {
    if (i !== words.length - 1) {
      return word + maxSpaceBtween;
    }
    return word;
  });

  const spaceLeft = maxWidth - words.join('').length;

  words = words.map((word, i) => {
    if (i < spaceLeft) {
      return word + ' ';
    }
    return word;
  });

  return words.join('');
}

// test
const words = [
    'Science',
    'is',
    'what',
    'we',
    'understand',
    'well',
    'enough',
    'to',
    'explain',
    'to',
    'a',
    'computer.',
    'Art',
    'is',
    'everything',
    'else',
    'we',
    'do',
  ],
  maxWidth = 20;

console.log(fullJustify(words, maxWidth));
