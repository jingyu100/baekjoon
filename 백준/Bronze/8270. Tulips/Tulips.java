import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int n = Integer.parseInt(br.readLine());
       
       StringTokenizer st = new StringTokenizer(br.readLine());
       HashSet<Integer> tulips = new HashSet<>();
       
       for (int i = 0; i < n; i++) {
           tulips.add(Integer.parseInt(st.nextToken()));
       }
       
       int totalKinds = 15000;
       int existingKinds = tulips.size();
       int missingKinds = totalKinds - existingKinds;
       
       System.out.println(missingKinds);
   }
}