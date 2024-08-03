import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        boolean chkList[] = new boolean[1001];
        int cnt = 0;
        chkList[1] = true;
        for (int i = 2; i * i <= 1000; i++)
            if (!chkList[i])
                for (int j = i * i; j <= 1000; j += i)
                    chkList[j] = true;
        String list[] = br.readLine().split(" ");
        for (int i = 0; i < list.length; i++) {
            if (!chkList[Integer.parseInt(list[i])])
                cnt++;
        }
        System.out.println(cnt);
    }
}