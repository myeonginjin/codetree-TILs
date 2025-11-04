import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int OFFSET = 1000000;
        int N = sc.nextInt();

        int[] sumCount = new int[N + OFFSET * 2 + 1];
        int[] countWhite = new int[N + OFFSET * 2 + 1];
        int[] countBlack = new int[N + OFFSET * 2 + 1];

        int cur = OFFSET;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'L'){
                while(x-- > 0){
                    sumCount[cur] = 1;
                    countWhite[cur]++;
                    if(x > 0) cur--; // 현재 위치를 왼쪽으로 이동시킴
                }
            }else{
                while(x-- > 0){
                    sumCount[cur] = 2;
                    countBlack[cur]++;
                    if(x > 0) cur++; // 현재 위치를 오른쪽으로 이동시킴
                }
            }    
        }
        int greyCount = 0;
            int whiteCount = 0;
            int blackCount = 0;

            for(int i = 0; i<= 2 * OFFSET; i++){
                if(countBlack[i] >= 2 && countWhite[i] >= 2){
                    greyCount++;
                }
                else if(sumCount[i] == 2) blackCount++;
                else if(sumCount[i] == 1) whiteCount++;
            }
            System.out.println(whiteCount + " " + blackCount + " " + greyCount);
    }
}