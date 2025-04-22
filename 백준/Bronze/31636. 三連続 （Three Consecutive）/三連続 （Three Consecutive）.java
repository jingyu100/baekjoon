import java.util.*;
import java.io.*;

public class Main    {
    public static void main(String args[]) throws IOException   {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        int result = 0;
        String str = br.readLine();
        
        for(int i = 0; i < str.length(); i++)    {
            if(str.charAt(i) != 'o') result = 0;
            if(str.charAt(i) == 'o') result++;
            if(result >= 3) break;
        }
        System.out.println(result >= 3 ? "Yes" : "No");
    }
}