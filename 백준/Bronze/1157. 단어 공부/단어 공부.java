import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[26];
        int max = 0;
        char ans = '?';
        String s = sc.next().toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) -'A' ;
            list[num]++;
        }
        for (int i = 0; i < list.length; i++) {
            if(max < list[i]){
                max = list[i];
                ans = (char)(i+'A');
            } else if (max == list[i]){
                ans = '?';
            }
        }
        System.out.println(ans);
    }
}