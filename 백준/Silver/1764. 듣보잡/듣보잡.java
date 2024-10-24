import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int ans;
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Set<String> nSet = new HashSet<>();
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nSet.add(sc.nextLine());
        }
        for (int i = 0; i < m; i++) {
            String input = sc.nextLine();
            if (nSet.contains(input)) resultList.add(input);
        }
        Collections.sort(resultList);
        ans = resultList.size();
        for (String name : resultList) {
            sb.append(name).append("\n");
        }
        System.out.println(ans);
        System.out.print(sb);
    }
}
