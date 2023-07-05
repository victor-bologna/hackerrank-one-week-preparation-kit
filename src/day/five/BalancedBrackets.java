package day.five;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

class ResultThree {
    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new LinkedHashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        if(s.isEmpty() || s == null) {
            return "NO";
        }
        for (char word : s.toCharArray()) {
            if (map.containsKey(word)) {
                if (stack.isEmpty() || stack.peek() != map.get(word)) {
                    return "NO";
                }
                stack.pop();
            } else {
                stack.push(word);
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}

public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(ResultThree.isBalanced("{(([])[])[]}"));
    }
}
