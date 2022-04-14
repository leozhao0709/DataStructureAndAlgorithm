import calPoints from '@app/basic/stack/baseball';

describe('baseball', () => {
  it('should return 30 when ops = ["5","2","C","D","+"]', () => {
    const ops = ['5', '2', 'C', 'D', '+'];
    expect(calPoints(ops)).toBe(30);
  });

  it('should return 27 when ops = ["5","-2","4","C","D","9","+","+"]', () => {
    const ops = ['5', '-2', '4', 'C', 'D', '9', '+', '+'];
    expect(calPoints(ops)).toBe(27);
  });

  it('should return 1 when ops = ["1"]', () => {
    const ops = ['1'];
    expect(calPoints(ops)).toBe(1);
  });
});
