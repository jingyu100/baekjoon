import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder(); 
        
        String input = br.readLine();
        
        boolean tag = false;  
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '<') {
                sb.append(word.reverse());
                word.setLength(0);
                tag = true;
                sb.append(ch);
            }
            else if (ch == '>') {
                tag = false;
                sb.append(ch);
            }
            else if (tag) sb.append(ch);
            else if (ch == ' ') {
                sb.append(word.reverse());
                word.setLength(0);
                sb.append(ch);
            }
            else 
                word.append(ch);
        }
        sb.append(word.reverse());
        
        System.out.println(sb);
    }
}