import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            long tmp = (long) input * input;
            String tmpStr = String.valueOf(tmp);
            String inputStr = String.valueOf(input);

            if (tmpStr.length() >= inputStr.length()) {
                String last = tmpStr.substring(tmpStr.length() - inputStr.length());
                if (last.equals(inputStr)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}