import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            if(s.equals("*")) break;
            boolean[] v = new boolean[26];
            for (char c : s.toCharArray()) if (c >= 'a' && c <= 'z') v[c-'a'] = true;
            boolean ok = true;
            for (boolean b : v) { 
                if (!b) {
                    ok = false; 
                    break;
                }
            }
            System.out.println(ok ? "Y" : "N");
        }
    }
}
