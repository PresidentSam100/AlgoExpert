import java.util.*;

class Program {
  public int reversePolishNotation(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < tokens.length; i++) {
      if (tokens[i].equals("+")) {
        int a = stack.pop();
        int b = stack.pop();
        int sum = a + b;
        stack.push(sum);
      } else if (tokens[i].equals("-")) {
        int a = stack.pop();
        int b = stack.pop();
        int diff = b - a;
        stack.push(diff);
      } else if (tokens[i].equals("*")) {
        int a = stack.pop();
        int b = stack.pop();
        int prod = a * b;
        stack.push(prod);
      } else if (tokens[i].equals("/")) {
        int a = stack.pop();
        int b = stack.pop();
        int quo = b / a;
        stack.push(quo);
      } else {
        stack.push(Integer.parseInt(tokens[i]));
      }
    }
    return stack.pop();
  }
}
