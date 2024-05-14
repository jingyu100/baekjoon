import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger money = new BigInteger(sc.next());
        BigInteger cnt = new BigInteger(sc.next());
        System.out.println(money.divide(cnt));
        System.out.println(money.remainder(cnt));
    }
}