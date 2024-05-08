import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = sc.nextInt();
        int[] list = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            list[i] = i;
        }
        for (int x = 0; x < count; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            for (int y = 0; y < (j - i) / 2 + 1; y++) {
                int box = list[i + y];
                list[i + y] = list[j - y];
                list[j - y] = box;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(list[i] + " ");
        }
    }
}