import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			String line = br.readLine();
			Stack<Character> st = new Stack<Character>();
			for(int j = 0; j < line.length(); j++) {
				if(line.charAt(j) == '(') {
					st.push(line.charAt(j));
				}else {
					if(st.empty()) {
						st.push(line.charAt(j));
						break;
					}else {
						st.pop();
					}
				}
			}
			if(st.empty()) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}