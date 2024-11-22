import java.io.*;
import java.util.*;

class Main {
    static int[] check = new int[81];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= arr[0]; i++) {
            for (int j = 1; j <= arr[1]; j++) {
                for (int k = 1; k <= arr[2]; k++) {
                    check[i + j + k]++;
                }
            }
        }
        int max = 0;
        int maxIdx = 0;
        for (int i = 1; i < 81; i++) {
            if (check[i] > max) {
                max = check[i];
                maxIdx = i;
            }
        }
        System.out.println(maxIdx);
    }
}
