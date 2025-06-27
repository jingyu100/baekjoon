import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            int len = 1;
            for (int i = 0; i < n; i++) {
                len *= 3;
            }
            
            char[] arr = new char[len];
            for (int i = 0; i < len; i++) {
                arr[i] = '-';
            }
            
            cantor(arr, 0, len);
            System.out.println(new String(arr));
        }
    }
    
    static void cantor(char[] arr, int start, int size) {
        if (size == 1) return;
        
        int part = size / 3;
        
        for (int i = start + part; i < start + part * 2; i++) {
            arr[i] = ' ';
        }
        
        cantor(arr, start, part);
        cantor(arr, start + part * 2, part);
    }
}