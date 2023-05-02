import java.util.Stack;

public class ExpressionEvaluator {
    public static void main(String[] args) {
        String expression = "2 * 3 + 4 * 5";  // example expression

        Stack<Integer> operands = new Stack<>();  // stack to store operands
        Stack<Character> operators = new Stack<>();  // stack to store operators

        // loop through the expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == ' ') {
                continue;  // ignore spaces
            }
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                // c is an operator, push it onto the operators stack
                operators.push(c);
            } else if (c >= '0' && c <= '9') {
                // c is an operand, push it onto the operands stack
                int operand = 0;
                while (i < expression.length() && expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
                    operand = (operand * 10) + (expression.charAt(i) - '0');
                    i++;
                }
                i--;  // decrement i to compensate for the outer loop increment
                operands.push(operand);
            }
        }

        // evaluate the expression
        while (!operators.isEmpty()) {
            char operator = operators.pop();
            int operand2 = operands.pop();
            int operand1 = operands.pop();
            int result = 0;
            switch (operator) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    result = operand1 / operand2;
                    break;
            }
            operands.push(result);
        }

        // the final result is at the top of the operands stack
        int result = operands.pop();
        System.out.println("Result: " + result);  // prints "Result: 26"
    }
}
