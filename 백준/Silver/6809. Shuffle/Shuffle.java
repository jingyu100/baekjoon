import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       char[] map = new char[27];
       for (int i = 0; i < 27; i++) {
           map[i] = br.readLine().charAt(0);
       }
       long n = Long.parseLong(br.readLine());
       String text = br.readLine();
       int[] nthMap = new int[27];
       for (int i = 0; i < 27; i++) {
           int[] path = new int[27];
           boolean[] visited = new boolean[27];
           int current = i;
           int length = 0;
           while (!visited[current]) {
               path[length++] = current;
               visited[current] = true;
               current = charToIndex(map[current]);
           }
           int cycleStart = 0;
           while (path[cycleStart] != current) {
               cycleStart++;
           }
           int cycleLength = length - cycleStart;
           long effectiveN = n;
           if (effectiveN < cycleStart) {
               nthMap[i] = path[(int)effectiveN];
           } else {
               effectiveN = cycleStart + (effectiveN - cycleStart) % cycleLength;
               nthMap[i] = path[(int)effectiveN];
           }
       }
       StringBuilder result = new StringBuilder();
       for (int i = 0; i < text.length(); i++) {
           char c = text.charAt(i);
           int idx = charToIndex(c);
           result.append(indexToChar(nthMap[idx]));
       }
       System.out.println(result.toString());
   }
   private static int charToIndex(char c) {
       if (c == '_') return 26;
       return c - 'A';
   }
   private static char indexToChar(int idx) {
       if (idx == 26) return '_';
       return (char)('A' + idx);
   }
}