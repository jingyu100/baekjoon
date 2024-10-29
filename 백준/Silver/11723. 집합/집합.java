import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(br.readLine());
        int bitmask = 0;
        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            switch (command) {
                case "add":
                    bitmask |= (1 << (Integer.parseInt(input[1]) - 1));
                    break;
                case "remove":
                    bitmask &= ~(1 << (Integer.parseInt(input[1]) - 1));
                    break;
                case "check":
                    if ((bitmask & (1 << (Integer.parseInt(input[1]) - 1))) != 0) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "toggle":
                    bitmask ^= (1 << (Integer.parseInt(input[1]) - 1));
                    break;
                case "all":
                    bitmask = (1 << 20) - 1;
                    break;
                case "empty":
                    bitmask = 0;
                    break;
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
