import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            String comm = br.readLine();
            String[] commlist = comm.split(" ");
            switch(commlist[0]) {
                case "1":
                    st.push(Integer.parseInt(commlist[1]));
                    break;
                case "2":
                    if(!st.empty()) {
                        System.out.println(st.pop());
                    } else {
                        System.out.println("-1");
                    }
                    break;
                case "3":
                    System.out.println(st.size());
                    break;
                case "4":
                    if(st.empty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "5":
                    if(!st.empty()) {
                        System.out.println(st.peek());
                    } else {
                        System.out.println("-1");
                    }
                    break;
            }
        }
    }
}