import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list = new int[26];
        for(int i = 0; i < list.length; i++) {
            list[i] = -1;
        }
        String word = in.nextLine();
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(list[ch - 'a'] == -1) {
                list[ch - 'a'] = i;
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ") ;
        }
    }
}
