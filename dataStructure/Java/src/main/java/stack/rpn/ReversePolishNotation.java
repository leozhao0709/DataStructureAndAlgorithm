package stack.rpn;

import java.util.Stack;

/**
 * Created by lzhao on 7/5/17.
 */

class ReversePolishNotation {

    private String infixExpression;
    private String suffixExpression;
    

    ReversePolishNotation(String expression) {
        this.infixExpression = expression;
        this.suffixExpression = "";
    }

    String getSuffixExpression() {
        Stack<Character> ops = new Stack<Character>();

        int i = 0;

        while (i < this.infixExpression.length()) {
            Character currentChar = this.infixExpression.charAt(i);
            while (currentChar <='9' && currentChar >= '0' && i < this.infixExpression.length()) {
                this.suffixExpression += currentChar;
                i++;
                if (i < this.infixExpression.length()) {
                    currentChar = this.infixExpression.charAt(i);
                }
            }
            this.suffixExpression += ' ';

            if (currentChar > '9' || currentChar < '0') {
                if (this.shouldPushIntoStackDirectly(currentChar, ops)) {
                    ops.push(currentChar);
                } else {
                    Character op = ops.peek();
                    while (op != '(' && !ops.empty()) {
                        op = ops.pop();
                        this.suffixExpression += op;
                        if (!ops.empty()) {
                            op = ops.peek();
                        }
                    }

                    if (currentChar != ')') {
                        ops.push(currentChar);
                    } else {
                        // need pop the '(' and do not print it
                        ops.pop();
                    }
                }
            }

            i++;
        }

        while (!ops.empty()) {
            this.suffixExpression += ops.pop();
        }

        System.out.println(suffixExpression);
        return suffixExpression;
    }

    private boolean shouldPushIntoStackDirectly(Character op1, Stack<Character> ops) {
        if (ops.empty())
        {
            return true;
        }

        if (op1 == '(')
        {
            return true;
        }

        Character opsTop = ops.peek();

        return opsTop == '(' || (opsTop == '+' || opsTop == '-') && (op1 == '*' || op1 == '/');

    }
}
