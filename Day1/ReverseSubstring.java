
import java.util.Stack;

public class ReverseSubstring {
    public static void main(String[] args) {

        String str = "my name is asha";
        String[] words = str.split(" ");

        Stack<Character> stack = new Stack<>();

        for (String word : words) {

            for (char ch : word.toCharArray()) {
                stack.push(ch);
            }

            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }

            System.out.print(" ");
        }
    }
}
