import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] list = new int[100][100];
        int cnt = sc.nextInt();
        int dap = 0;
        for (int i = 0; i < cnt; i++) {
            int left = sc.nextInt();
            int floor = sc.nextInt();
            for (int j = left; j < 10+left; j++) {
                for (int k = floor; k < 10+floor; k++) {
                    list[j][k]++;
                    if(list[j][k] == 1) {
                        dap++;
                    }
                }
            }
        }
        System.out.println(dap);
    }
}