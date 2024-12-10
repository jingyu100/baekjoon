import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	int n,m,sum1=0,sum2=0;
    	
    	n = sc.nextInt();
        m = sc.nextInt();
    	
    	for (int i = 0; i < n; i++) {
    		sum1 = sum1 + sc.nextInt();
    	}
        
    	for (int i = 0; i < m; i++) {
    		sum2 = sum2 + sc.nextInt();
    	}
    	
    	System.out.println(sum1 - sum2);
  }
}