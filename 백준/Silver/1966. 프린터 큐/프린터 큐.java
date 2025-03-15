import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int t = Integer.parseInt(br.readLine());
       
       for (int i = 0; i < t; i++) {
           StringTokenizer st = new StringTokenizer(br.readLine());
           int n = Integer.parseInt(st.nextToken());
           int m = Integer.parseInt(st.nextToken());
           
           st = new StringTokenizer(br.readLine());
           
           Queue<int[]> queue = new LinkedList<>();
           
           for (int j = 0; j < n; j++) {
               queue.offer(new int[]{j, Integer.parseInt(st.nextToken())});
           }
           
           int count = 0;
           
           while (!queue.isEmpty()) {
               int[] current = queue.poll();
               boolean isMax = true;
               for (int[] doc : queue) {
                   if (doc[1] > current[1]) {
                       isMax = false;
                       break;
                   }
               }
               
               if (isMax) {
                   count++;
                   if (current[0] == m) break;
               } else queue.offer(current);
           }
       System.out.println(count);
       }
   }
}