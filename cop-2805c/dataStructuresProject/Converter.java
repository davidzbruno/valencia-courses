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

public class StackCalc{

    private String operators = "^*/+-";
    private String operands = "[a-z1-9]";
    
    /*
        Assigns a numerical weight to the mathamical operators, returing -1 if not found
    */
    private int operatorWeight(char operator){
        int weight = -1; 
        switch(operator) {
            case '+':
            case '-':
                weight = 1;
                break;
            case '*':
            case '/':
                weight = 2;
                break;
            case '^':
                weight = 3;
                break;
        }
        return weight;
    }

    /*
        Returns true if operator1 is of higher precedence than operator2, returns false otherwise
    */
    private boolean pemdas(char operator1, char operator2){

        if(!operators.contains(operator1+"") || !operators.contains(operator2+"")) return false;

        int op1Weight = operatorWeight(operator1);
        int op2Weight = operatorWeight(operator2);

        return op1Weight > op2Weight;
    }

    /*
        Converts the Infix notation to a PostFix notation
    */
    public String toPostfix(String infixInput){
        if(infixInput == null || infixInput.length() == 0) return "";

        String postfixOutput = "";
        infixInput = infixInput.replaceAll("\\s+","");

        Stack<Character> converStack = new Stack<Character>();
        for(char c : infixInput.toCharArray()){
            if(operators.contains(c+"")){
                while( !converStack.empty() && converStack.peek()!='(' && !pemdas(c,converStack.peek()) ){
                    System.out.println(converStack);
                    postfixOutput += " " + converStack.pop();
                }
                System.out.println(converStack);
                converStack.push(c);
            }
            else if(c == '('){
                converStack.push(c);
            }
            else if(c == ')'){
                while( !converStack.empty() && converStack.peek()!='('){
                    postfixOutput += " " + converStack.pop();
                }
                converStack.pop(); //removes the inital open parenthesis from the stack
            }
            else{
                postfixOutput += " " + c;
            }
        }

        while(!converStack.empty()) //places all the final operators in the output
            postfixOutput += converStack.pop();

        return postfixOutput;
    }
    public static void main(String[] args) {
        System.out.println("Enter Infix Expression");
        
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();

        Converter con = new Converter();
        String postfix = con.toPostfix(expression);
        System.out.printf("Output = %s\n", postfix);
    }
}