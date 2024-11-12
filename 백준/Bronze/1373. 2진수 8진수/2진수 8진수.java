import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		BigInteger n = new BigInteger(s, 2);
		String res = n.toString(8);
		System.out.println(res);
        
	}
}