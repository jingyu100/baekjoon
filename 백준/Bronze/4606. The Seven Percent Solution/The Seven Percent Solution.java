import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<Character, String> encodings = new HashMap<>();
        encodings.put(' ', "%20");
        encodings.put('!', "%21");
        encodings.put('$', "%24");
        encodings.put('%', "%25");
        encodings.put('(', "%28");
        encodings.put(')', "%29");
        encodings.put('*', "%2a");
        
        while (true) {
            String line = sc.nextLine();
            
            if (line.equals("#")) {
                break;
            }
            
            StringBuilder result = new StringBuilder();
            
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                
                if (encodings.containsKey(c)) {
                    result.append(encodings.get(c));
                } else {
                    result.append(c);
                }
            }
            
            System.out.println(result.toString());
        }
    }
}