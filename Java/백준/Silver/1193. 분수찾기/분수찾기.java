import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        int count=1,countsum=0;
        while (true) {
            if (ans <= countsum + count) {
                if (count % 2 == 1) {	
                    System.out.print((count - (ans-countsum-1)) + "/" + (ans-countsum));
                    break;
                } else {
                    System.out.print((ans-countsum) + "/" + (count-(ans-countsum-1)));
                    break;
                }
            } else {
                countsum += count;
                count++;
            }
        }
    }
}