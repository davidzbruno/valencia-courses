import java.util.*;
import java.util.regex.Pattern;

/*
You will be able to use the push, pop and peek of Stack concept.

Post-Fix calculator - When an arithmetic expression is presented in the postfix form,
you can use a stack to evaluate the expression to get the final value. 
For example: the expression 3 + 5 * 9 (which is in the usual infix form) can be written as 3 5 9 * + in the postfix.
More interestingly, post form removes all parentheses and thus all implicit precedence rules.

Use the stack concept to create a post-fix calculator.
I will be using a test-harness to run your program.
Please make sure it meets the requirements to be run by the test harness.  
*/

public class StackCalc {

    public Stack<String> stack = new Stack<String>();
    private String expression;

    /*
        Returns true if the input string is an operator
    */
    private boolean isOperator(String str){
        if ( str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")
                || str.equals("(") || str.equals(")"))
                return true;
        return false;
    }

    /*
     * Assigns a numerical weight to the mathamical operators, returing -1 if not
     * found
     */
    private int operatorWeight(String operator) {
        int weight = -1;
        switch (operator) {
        case "+":
        case "-":
            weight = 1;
            break;
        case "*":
        case "/":
            weight = 2;
            break;
        case "^":
            weight = 3;
            break;
        case "(":
        case ")":
            weight = 4;
            break;
        }
        return weight;
    }

    /*
     * Returns true if operator1 is of higher precedence than operator2, returns
     * false otherwise
     */
    private boolean isHigherPrecedence(String operator1, String operator2) {

        if (!isOperator(operator1) || !isOperator(operator2) )
            return false;

        int op1Weight = operatorWeight(operator1);
        int op2Weight = operatorWeight(operator2);

        return op1Weight > op2Weight;
    }

    /*
     * Converts the Infix notation to a PostFix notation
     */
    public String toPostfix(String infixInput) {
        if (infixInput == null || infixInput.length() == 0)
            return "";

        StringBuilder postfixOutput = new StringBuilder("");
        

        String temp[] = infixInput.split("(?=[*-+/()])|(?<=[*-+/()])");

        for(String str: temp) {
            if (isOperator(str)) {
                while (!stack.empty() && !stack.peek().equals("(")&& !isHigherPrecedence(str, stack.peek())) {
                    postfixOutput.append(stack.pop()+" ");
                }
                stack.push(str);
            } else if (str.equals("(")) {
                stack.push(str);
            } else if (str.equals(")")) {
                while (!stack.empty() && !stack.peek().equals("(")) {
                    postfixOutput.append(stack.pop()+" ");
                }
                stack.pop(); // removes the inital open parenthesis from the stack
            } else {
                    postfixOutput.append(str+" ");
            }
        }

        while (!stack.empty()) // places all the final operators in the output
            postfixOutput.append(stack.pop()+" ");

        expression = postfixOutput.toString();
        return postfixOutput.toString();
    }

    /*
     * Fills the stack with the following expression
     */
    private void fillExpression(){
        StringBuilder temp = new StringBuilder();
        
        while(!stack.isEmpty()){
            temp.append(stack.pop()+" ");
        }

        expression = temp.reverse().toString().trim();
    }

    /*
     * Computes the result stack
     */
    public double answer(){
        if( !stack.isEmpty() || expression.length() == 0 )
            fillExpression();

        double operand1 = 0, operand2 = 0, result = 0;

        for(String op : expression.split(" ")){
            if(isOperator(op)){
                operand1 = Double.valueOf(stack.pop());
                operand2 = Double.valueOf(stack.pop());
                result = compute(operand1,operand2, op);
                stack.push(String.valueOf(result));
            }
            else
                stack.push(op);
        }
        result = Double.valueOf(stack.pop());
        return result;
    }

    /*
     * Computes the result between two operands and a given operator
     */
    public double compute(double operand1, double operand2, String operator){
        if(operator.equals("+")) return operand1+operand2;
        else if(operator.equals("-")) return operand1-operand2;
        else if(operator.equals("*")) return operand1*operand2;
        else return operand1/operand2;
    }

    public static void main(String[] args) {
        // System.out.println("Enter Infix Expression");

        // Scanner sc = new Scanner(System.in);
        // String expression = sc.nextLine();

        // // expression = "3+5*9";
        // StackCalc stackCalc = new StackCalc();
        // System.out.printf("Postfix Expression: %s\n",stackCalc.toPostfix(expression));
        // System.out.printf("Answer: %.2f\n",stackCalc.answer());

        StackCalc stackCalc = new StackCalc();
        String[] values = {"3", "5", "9", "*", "+"};
        for(int i = 0; i < 5; i++) {
            stackCalc.stack.push(values[i]);
        }
        System.out.println(stackCalc.stack);
        System.out.println(stackCalc.answer());

    }
}