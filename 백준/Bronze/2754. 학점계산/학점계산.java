import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double ans = 0;
        String tmp = br.readLine();
        char grade = tmp.charAt(0);
        char op = ' ';
        if (grade != 'F') op = tmp.charAt(1);
        switch (grade) {
            case 'A':
                ans += 4;
                break;
            case 'B':
                ans += 3;
                break;
            case 'C':
                ans += 2;
                break;
            case 'D':
                ans += 1;
                break;
            case 'F':
                break;
        }
        switch (op) {
            case '+':
                ans += 0.3;
                break;
            case '-':
                ans -= 0.3;
                break;
        }
        System.out.println(ans);
    }
}
