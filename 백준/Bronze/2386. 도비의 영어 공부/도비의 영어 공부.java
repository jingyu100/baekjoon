import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;

        while (true) {

            str = sc.nextLine();
            if (str.equals("#")) break;

            int answer = 0;
            char find = str.charAt(0);
            str = str.substring(2).toLowerCase();

            for (char ch : str.toCharArray()) {
                if (ch == find) answer++;
            }

            System.out.println(find + " " + answer);
        }
    }
}