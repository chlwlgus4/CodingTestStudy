import java.util.Stack;

public class main {

    public static boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        if(s.substring(0,1).equals(")")) return false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ('(')) {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        if(!stack.isEmpty()) {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = ")()()";
        System.out.println(solution(s));
    }
}
