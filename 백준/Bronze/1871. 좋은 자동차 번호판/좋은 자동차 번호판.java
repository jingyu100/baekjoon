import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String carNumber = br.readLine();
            String[] parts = carNumber.split("-");

            int totalAlphabet = (parts[0].charAt(0) - 'A') * 26 * 26 +
                    (parts[0].charAt(1) - 'A') * 26 +
                    (parts[0].charAt(2) - 'A');

            int num = Integer.parseInt(parts[1]);
            int result = Math.abs(num - totalAlphabet);

            if (result <= 100) {
                System.out.println("nice");
            } else {
                System.out.println("not nice");
            }
        }
    }
}