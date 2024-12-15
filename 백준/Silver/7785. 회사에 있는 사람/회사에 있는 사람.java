import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Boolean> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            String nm = in[0];
            boolean e = in[1].equals("enter");
            
            if (e) m.put(nm, true);
            else 
                m.remove(nm);
        }
        
        List<String> l = new ArrayList<>(m.keySet());
        Collections.sort(l, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        
        for (String nm : l) {
            sb.append(nm).append('\n');
        }
        
        System.out.print(sb);
    }
}