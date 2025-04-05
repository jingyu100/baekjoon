import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int br_row = Integer.parseInt(st.nextToken());
        int br_col = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int dr_row = Integer.parseInt(st.nextToken());
        int dr_col = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int jr_row = Integer.parseInt(st.nextToken());
        int jr_col = Integer.parseInt(st.nextToken());
        
        int bessieTime = Math.max(Math.abs(br_row - jr_row), Math.abs(br_col - jr_col));
        
        int daisyTime = Math.abs(dr_row - jr_row) + Math.abs(dr_col - jr_col);
        
        if (bessieTime < daisyTime) {
            System.out.println("bessie");
        } else if (daisyTime < bessieTime) {
            System.out.println("daisy");
        } else {
            System.out.println("tie");
        }
    }
}