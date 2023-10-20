import java.util.*;
// Time Complexity: O(n)
// Space Complexity: O(n)
// n is the length of the string
// Solution: Stack and Loop Condition
class Program {
  public static boolean balancedBrackets(String str) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == '(' || c == '{' || c == '[') {
        // Add Opening Brackets to the Stack
        stack.push(c);
      } else if (c == ')') {
        if (stack.isEmpty() || stack.peek() != '(') {
          // Stack Empty or No Corresponding Opening Bracket
          return false;
        } else {
          // Remove Corresponding Opening Bracket
          stack.pop();
        }
      } else if (c == '}') {
        if (stack.isEmpty() || stack.peek() != '{') {
          // Stack Empty or No Corresponding Opening Bracket
          return false;
        } else {
          // Remove Corresponding Opening Bracket
          stack.pop();
        }
      } else if (c == ']') {
        if (stack.isEmpty() || stack.peek() != '[') {
          // Stack Empty or No Corresponding Opening Bracket
          return false;
        } else {
          // Remove Corresponding Opening Bracket
          stack.pop();
        }
      }
    }
    // String is balanced if the resulting stack is empty at this point
    return stack.isEmpty();
  }
}
