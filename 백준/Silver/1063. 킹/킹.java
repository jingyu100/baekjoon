import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int kx = input[0].charAt(0) - 'A';
        int ky = input[0].charAt(1) - '1';
        int sx = input[1].charAt(0) - 'A';
        int sy = input[1].charAt(1) - '1';
        
        int n = Integer.parseInt(input[2]);
        
        while(n-- > 0) {
            String move = br.readLine();
            int dx = 0, dy = 0;
            
            switch(move) {
                case "R":  dx = 1; dy = 0; break;
                case "L":  dx = -1; dy = 0; break;
                case "B":  dx = 0; dy = -1; break;
                case "T":  dx = 0; dy = 1; break;
                case "RT": dx = 1; dy = 1; break;
                case "LT": dx = -1; dy = 1; break;
                case "RB": dx = 1; dy = -1; break;
                case "LB": dx = -1; dy = -1; break;
            }
            
            int nkx = kx + dx;
            int nky = ky + dy;
            
            if(nkx < 0 || nkx > 7 || nky < 0 || nky > 7) continue;
            
            if(nkx == sx && nky == sy) {
                int nsx = sx + dx;
                int nsy = sy + dy;
                if(nsx < 0 || nsx > 7 || nsy < 0 || nsy > 7) continue;
                sx = nsx;
                sy = nsy;
            }
            
            kx = nkx;
            ky = nky;
        }
        
        System.out.println((char)(kx+'A')+""+(ky+1));
        System.out.println((char)(sx+'A')+""+(sy+1));
    }
}