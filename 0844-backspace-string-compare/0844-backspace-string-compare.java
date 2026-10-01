
class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        Stack<Character> stack2 = new Stack<>();

        for (char ch : t.toCharArray()) {
            if (ch != '#') {
                stack2.push(ch);
            } else if (!stack2.isEmpty()) {
                stack2.pop();
            }
        }

        return stack.equals(stack2);
    }
}

