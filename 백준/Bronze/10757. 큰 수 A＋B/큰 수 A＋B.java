import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger(); 
        BigInteger n1 = sc.nextBigInteger(); 
        System.out.println(n.add(n1));
    }
}