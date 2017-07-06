package stack.rpn;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lzhao on 7/5/17.
 */

class ReversePolishNotation {

    private String infixExpression;
    private String suffixExpression;

    public ReversePolishNotation(String expression) {
        this.infixExpression = expression;
    }

    public String getSuffixExpression() {

        Stack<String> op = new Stack<String>();

        String pattern = "(\\d+)\\s*(\\D?)";
        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(this.infixExpression);

        while (m.find()) {
            System.out.println(m.group(1));
            System.out.println(m.group(2));
        }

        return suffixExpression;
    }
}
