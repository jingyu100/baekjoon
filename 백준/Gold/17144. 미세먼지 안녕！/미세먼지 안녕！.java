import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       int r = sc.nextInt();
       int c = sc.nextInt();
       int t = sc.nextInt();
       
       int[][] room = new int[r][c];
       int air = -1;
       
       for(int i = 0; i < r; i++) {
           for(int j = 0; j < c; j++) {
               room[i][j] = sc.nextInt();
               if(room[i][j] == -1 && air == -1) air = i;
           }
       }
       
       for(int time = 0; time < t; time++) {
           spread(room, r, c);
           clean(room, r, c, air);
       }
       
       int answer = 0;
       for(int i = 0; i < r; i++) {
           for(int j = 0; j < c; j++) {
               if(room[i][j] > 0) answer += room[i][j];
           }
       }
       
       System.out.println(answer);
   }
   
   static void spread(int[][] room, int r, int c) {
       
       int[][] tmp = new int[r][c];
       int[] dx = {-1, 1, 0, 0};
       int[] dy = {0, 0, -1, 1};
       
       for(int i = 0; i < r; i++) {
           for(int j = 0; j < c; j++) {
               if(room[i][j] <= 0) continue;
               
               int amount = room[i][j] / 5;
               int count = 0;
               
               for(int k = 0; k < 4; k++) {
                   int nx = i + dx[k];
                   int ny = j + dy[k];
                   
                   if(nx >= 0 && nx < r && ny >= 0 && ny < c && room[nx][ny] != -1) {
                       tmp[nx][ny] += amount;
                       count++;
                   }
               }
               
               tmp[i][j] += room[i][j] - (amount * count);
           }
       }
       
       for(int i = 0; i < r; i++) {
           for(int j = 0; j < c; j++) {
               if(room[i][j] != -1) room[i][j] = tmp[i][j];
           }
       }
   }
   
   static void clean(int[][] room, int r, int c, int air) {
       for(int i = air - 1; i > 0; i--) {
           room[i][0] = room[i-1][0];
       }
       for(int j = 0; j < c-1; j++) {
           room[0][j] = room[0][j+1];
       }
       for(int i = 0; i < air; i++) {
           room[i][c-1] = room[i+1][c-1];
       }
       for(int j = c-1; j > 1; j--) {
           room[air][j] = room[air][j-1];
       }
       room[air][1] = 0;
       
       for(int i = air + 2; i < r-1; i++) {
           room[i][0] = room[i+1][0];
       }
       for(int j = 0; j < c-1; j++) {
           room[r-1][j] = room[r-1][j+1];
       }
       for(int i = r-1; i > air + 1; i--) {
           room[i][c-1] = room[i-1][c-1];
       }
       for(int j = c-1; j > 1; j--) {
           room[air + 1][j] = room[air + 1][j-1];
       }
       room[air + 1][1] = 0;
   }
}