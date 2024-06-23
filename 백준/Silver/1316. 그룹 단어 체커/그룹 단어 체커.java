import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < num; i++) {
            String word = sc.next();
            boolean[] ck = new boolean[26];
            boolean tmp = true;
            for (int j = 0; j < word.length(); j++) {
                int index = word.charAt(j) - 'a';
                if(ck[index]) {
                    if(word.charAt(j) != word.charAt(j - 1)) {
                        tmp = false;
                        break;
                    }
                } else {
                    ck[index] = true;
                }
            }
            if(tmp) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
