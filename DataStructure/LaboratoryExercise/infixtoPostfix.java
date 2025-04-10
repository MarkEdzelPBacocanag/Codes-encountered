import java.util.Stack;
import java.util.*;

public class infixtoPostfix
{
   
   private static int precedence(char prec)
   {

      switch(prec)
      {
         // Low precedence
         case '+':
         case '-':
            return 1;
         // Medium precedence
         case '*':
         case '/':
         case '%':
            return 2;
         // High precedence
         case '^':
            return 3;
         default:
            return -1;   
         
      }
     
   }
      
   public static String infixToPostFix(String expression){
      StringBuilder result = new StringBuilder();
      Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            //checks if character is an operand
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
            // character equals to "(", push it to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // character equals to ")", pop until ")" is encountered
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid Expression"; // Parentheses not matched
                } else {
                    stack.pop();
                }
            }
            // If an operator is encountered
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
            //Shows the stacks
            System.out.println("Stack: " + stack);

        }

        // Pop's the remaining values
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                return "Invalid Expression"; // Parentheses not matched
            }
            result.append(stack.pop());
        }

        return result.toString();
   }
   
   public static void main(String[] args)
   {
     Scanner userI = new Scanner(System.in);
     
     //Ask user to provide an expression
     System.out.println("Enter a expression: ");
     String exp = userI.nextLine();
     
     //Puts the user's expression into the infix for convertion
     String infix = exp;
     System.out.print("Postfix expression: " + infixToPostFix(infix));
     
     userI.close();
   }

}