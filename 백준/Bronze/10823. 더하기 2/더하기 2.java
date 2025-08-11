import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder();
        int sum = 0;
        String l;
        
        while ((l = r.readLine()) != null) s.append(l);
        String[] a = s.toString().split(",");
        
        for (String x : a) sum += Integer.parseInt(x);

        System.out.println(sum);
    }
}
