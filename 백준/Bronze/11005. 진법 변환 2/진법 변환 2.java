import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        ArrayList<Character> list = new ArrayList<>();
        while (num > 0) {
            if (num % a < 10) list.add((char) (num % a + '0'));
            else list.add((char) (num % a - 10 + 'A'));
            num /= a;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
}