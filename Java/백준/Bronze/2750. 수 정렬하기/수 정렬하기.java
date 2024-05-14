import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for (int i = 0; i < cnt; i++) {
            System.out.println(list.get(i));
        }
    }
}