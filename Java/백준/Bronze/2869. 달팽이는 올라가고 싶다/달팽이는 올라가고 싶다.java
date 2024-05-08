import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int up = in.nextInt();		
        int down = in.nextInt();	
        int height = in.nextInt(); 	
        int day = (height - down) / (up - down);
        if ((height - down) % (up - down) != 0) {
            day++;
        }
        System.out.println(day);
    }
}
