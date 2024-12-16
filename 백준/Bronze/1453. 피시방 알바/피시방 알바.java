import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean[] computerList = new boolean[101];
        int cnt = 0;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (!computerList[tmp]) computerList[tmp] = true;
            else cnt++;
        }

        System.out.println(cnt);
    }
}
