package leetcode_30days_challenge_2020;

import java.util.Stack;

public class BackspaceStringCompare {

	public static boolean backspaceCompare(String S, String T) {
		S = generateNewString(S);
		T = generateNewString(T);
		System.out.println(S + "::" + T);
		if ((S.isEmpty() && T.isEmpty()) || S.equals(T)) {
			return true;
		}
		return false;
	}

	private static String generateNewString(String S) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '#') {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else {
				stack.push(S.charAt(i));
			}
		}
		return String.valueOf(stack);
	}

	/*
	 * Alternate Solution public String build(String S) { Stack<Character> ans = new
	 * Stack(); for (char c: S.toCharArray()) { if (c != '#') ans.push(c); else if
	 * (!ans.empty()) ans.pop(); } return String.valueOf(ans); }
	 */

	public static void main(String[] args) {
		// System.out.println(backspaceCompare("a##c", "#a#c"));
		System.out.println(generateNewString("xywrrmu#p"));
	}

}
