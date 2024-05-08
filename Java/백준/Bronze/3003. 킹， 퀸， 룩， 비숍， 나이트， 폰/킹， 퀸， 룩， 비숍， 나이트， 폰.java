import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {1,1,2,2,2,8};
        int[] mylist = new int[6];
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = sc.nextInt();
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] != mylist[i]) {
                System.out.print(list[i] - mylist[i]+ " ");
            }
            else
                System.out.print("0"+ " ");
        }
    }
}