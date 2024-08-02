import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            Stack<Character> st = new Stack<>();
            String word = br.readLine();
            if (word.charAt(0) == '.') break;
            boolean balanced = true;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == '(' || ch == '[') {
                    st.push(ch);
                } else if (ch == ')' || ch == ']') {
                    if (st.isEmpty()) {
                        balanced = false;
                        break;
                    }
                    char top = st.pop();
                    if ((ch == ')' && top != '(') || (ch == ']' && top != '[')) {
                        balanced = false;
                        break;
                    }
                }
            }
            if (balanced && st.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
