import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double score[] = new double[n];
        double avg = 0; 
        double max = 0;
        double sum = 0;
        for(int i=0;i<score.length;i++) {
            score[i] = sc.nextInt();
            if(score[i]>max)
                max = score[i];
        }
        for(int i=0;i<score.length;i++) {
            score[i] = (score[i]/max)*100;
            sum += score[i];
        }
        System.out.println(sum/n);
    }
}