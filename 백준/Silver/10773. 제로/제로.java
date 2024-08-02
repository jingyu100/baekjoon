import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                st.pop();
            } else {
                st.push(num);
            }
        }
        int size = st.size();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum+=st.pop();
        }
        System.out.println(sum);
    }
}