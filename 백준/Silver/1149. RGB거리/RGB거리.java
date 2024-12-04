import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] c = new int[n][3];
        
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            c[i][0] = Integer.parseInt(st.nextToken()); 
            c[i][1] = Integer.parseInt(st.nextToken()); 
            c[i][2] = Integer.parseInt(st.nextToken()); 
        }
        
        int[][] arr = new int[n][3];
        
        arr[0][0] = c[0][0]; 
        arr[0][1] = c[0][1];  
        arr[0][2] = c[0][2]; 
        
        for(int i = 1; i < n; i++) {
            arr[i][0] = c[i][0] + Math.min(arr[i-1][1], arr[i-1][2]);
            arr[i][1] = c[i][1] + Math.min(arr[i-1][0], arr[i-1][2]);
            arr[i][2] = c[i][2] + Math.min(arr[i-1][0], arr[i-1][1]);
        }
        
        int result = Math.min(Math.min(arr[n-1][0], arr[n-1][1]), arr[n-1][2]);
        System.out.println(result);
    }
}