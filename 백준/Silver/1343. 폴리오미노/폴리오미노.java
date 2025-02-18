import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();

        String result = board.replaceAll("XXXX", "AAAA");
        result = result.replaceAll("XX", "BB");

        if (result.contains("X")) System.out.println(-1);
        else System.out.println(result);
    }
}