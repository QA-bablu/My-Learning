package objectorientedconcepts;

import java.util.Stack;

public class BalancedParentheses {
	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false; // Unbalanced: No opening parenthesis to match
				}
				char top = stack.pop();
				if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
					return false; // Unbalanced: Mismatched parentheses
				}
			}
		}

		return stack.isEmpty(); // Balanced if stack is empty
	}

	public static void main(String[] args) {
		String[] testCases = { "{}()", "[{()}]", "({()})", "{}(", "({)}", "[[", "}{" };

		for (String testCase : testCases) {
			if (isBalanced(testCase)) {
				System.out.println(testCase + " is balanced.");
			} else {
				System.out.println(testCase + " is unbalanced.");
			}
		}
	}
}
