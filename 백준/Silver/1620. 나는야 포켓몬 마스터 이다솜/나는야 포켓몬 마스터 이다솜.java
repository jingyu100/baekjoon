import java.util.*;

class Main {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> revMap = new HashMap<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String tmp = sc.next();
            map.put(++cnt, tmp);
            revMap.put(tmp, cnt);
        }
        for (int i = 0; i < m; i++) {
            String tmp = sc.next();
            if (revMap.containsKey(tmp))
                System.out.println(revMap.get(tmp));
            else {
                int tmp1 = Integer.parseInt(tmp);
                System.out.println(map.get(tmp1));
            }
        }
    }
}