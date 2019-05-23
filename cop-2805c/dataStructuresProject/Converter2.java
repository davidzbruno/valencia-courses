import java.util.*;

class StackCalc{
    
    // Function to verify whether a character is english letter or numeric digit. 
    // We are assuming in this solution that operand will be a single character
    private boolean IsOperand(char C){
        if(C >= '0' && C <= '9') return true;
        if(C >= 'a' && C <= 'z') return true;
        if(C >= 'A' && C <= 'Z') return true;
        return false;
    }

    // Function to verify whether a character is operator symbol or not. 
    private boolean IsOperator(char C)
    {
        if(C == '+' || C == '-' || C == '*' || C == '/' || C== '$')
            return true;

        return false;
    }

    // Function to verify whether an operator is right associative or not. 
    private boolean IsRightAssociative(char op)
    {
        if(op == '$') return true;
        return false;
    }

    // Function to get weight of an operator. An operator with higher weight will have higher precedence. 
    private int GetOperatorWeight(char op)
    {
        int weight = -1; 
        switch(op)
        {
        case '+':
        case '-':
            weight = 1;
        case '*':
        case '/':
            weight = 2;
        case '$':
            weight = 3;
        }
        return weight;
    }

    // Function to perform an operation and return output. 
    private boolean HasHigherPrecedence(char op1, char op2)
    {
        int op1Weight = GetOperatorWeight(op1);
        int op2Weight = GetOperatorWeight(op2);

        // If operators have equal precedence, return true if they are left associative. 
        // return false, if right associative. 
        // if operator is left-associative, left one should be given priority. 
        if(op1Weight == op2Weight)
        {
            if(IsRightAssociative(op1)) return false;
            else return true;
        }
        return op1Weight > op2Weight;
    }




    // Function to evaluate Postfix expression and return output
    public String InfixToPostfix(String input)
    {
        Stack<Character> S = new Stack<Character>();
        String postfix = ""; // Initialize postfix as empty string.
        
        char[] expression = input.toCharArray();
        for(int i = 0; i< expression.length; ++i) {

            // Scanning each character from left. 
            // If character is a delimitter, move on. 
            if(expression[i] == ' ' || expression[i] == ',') continue; 

            // If character is operator, pop two elements from stack, perform operation and push the result back. 
            else if(IsOperator(expression[i])) 
            {
                while(!S.empty() && S.peek() != '(' && HasHigherPrecedence(S.peek(),expression[i]))
                {
                    postfix+= S.peek();
                    S.pop();
                }
                S.push(expression[i]);
            }
            // Else if character is an operand
            else if(IsOperand(expression[i]))
            {
                postfix += expression[i];
            }

            else if (expression[i] == '(') 
            {
                S.push(expression[i]);
            }

            else if(expression[i] == ')') 
            {
                while(!S.empty() && S.peek() !=  '(') {
                    postfix += S.peek();
                    S.pop();
                }
                S.pop();
            }
            System.out.println(S);
        }

        while(!S.empty()) {
            postfix += S.peek();
            S.pop();
        }

        return postfix;
    }


    public static void main(String[] args) {
        String expression;
        System.out.println("Enter Infix Expression");
        
        Scanner sc = new Scanner(System.in);
        expression = sc.nextLine();

        Converter2 con = new Converter2();
        String postfix = con.InfixToPostfix(expression);
        System.out.printf("Output = %s\n", postfix);
    }
}