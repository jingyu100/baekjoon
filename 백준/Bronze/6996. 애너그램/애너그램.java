import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            String a = sc.next();
            String b = sc.next();
            if (a.length() != b.length()) {
                System.out.println(a + " & " + b + " are NOT anagrams.");
                continue;
            }
            int[] chkList = new int[26];
            for (int j = 0; j < a.length(); j++) {
                chkList[a.charAt(j) - 'a']++;
            }
            for (int j = 0; j < b.length(); j++) {
                chkList[b.charAt(j) - 'a']--;
            }
            boolean isAnagram = true;
            for (int j = 0; j < chkList.length; j++) {
                if (chkList[j] != 0) {
                    isAnagram = false;
                    break;
                }
            }
            if (isAnagram) {
                System.out.println(a + " & " + b + " are anagrams.");
            } else {
                System.out.println(a + " & " + b + " are NOT anagrams.");
            }
        }
    }
}