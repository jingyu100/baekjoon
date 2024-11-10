import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(seq[0]);
        for (int i = 1; i < n; i++) {
            int key = seq[i];
            if (list.get(list.size() - 1) < key) {
                list.add(key);
            } else {
                int low = 0;
                int high = list.size() - 1;
                while (low < high) {
                    int mid = (low + high) / 2;
                    if (list.get(mid) >= key) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
                list.set(high, key);
            }
        }
        System.out.println(list.size());
    }
}
