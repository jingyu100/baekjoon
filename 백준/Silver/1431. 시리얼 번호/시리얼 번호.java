import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
   public static void main(String[] args) throws IOException {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int n = Integer.parseInt(br.readLine());
       String[] arr = new String[n];
       
       for (int i = 0; i < n; i++) {
           arr[i] = br.readLine();
       }
       
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               if (arr[i].length() < arr[j].length()) {
                   String tmp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = tmp;
               }
               else if (arr[i].length() == arr[j].length()) {
                   int sum1 = 0;
                   int sum2 = 0;
                   for (int k = 0; k < arr[i].length(); k++) {
                       if(arr[i].charAt(k) >= '0' && arr[i].charAt(k) <= '9') sum1 += arr[i].charAt(k) - '0';
                   }
                   for (int k = 0; k < arr[j].length(); k++) {
                       if(arr[j].charAt(k) >= '0' && arr[j].charAt(k) <= '9') sum2 += arr[j].charAt(k) - '0';
                   }
                   if (sum1 < sum2) {
                       String tmp = arr[i];
                       arr[i] = arr[j];
                       arr[j] = tmp;
                   }
                   else if (sum1 == sum2 && arr[i].compareTo(arr[j]) < 0) {
                       String tmp = arr[i];
                       arr[i] = arr[j];
                       arr[j] = tmp;
                   }
               }
           }
       }
       for (int i = 0; i < n; i++) {
           System.out.println(arr[i]);
       }
   }
}