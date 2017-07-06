package stack.rpn;

import static org.junit.Assert.*;

/**
 * Created by lzhao on 7/5/17.
 */
public class ReversePolishNotationTest {

    ReversePolishNotation reversePolishNotation;

    @org.junit.Before
    public void setUp() throws Exception {
        String expression = "9+ (3-1)*3+10/2";
        this.reversePolishNotation = new ReversePolishNotation(expression);
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void getSuffixExpression() throws Exception {
        String suffixExpression = this.reversePolishNotation.getSuffixExpression();
        System.out.println(suffixExpression);
    }

}