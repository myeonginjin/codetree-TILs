import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int MAX_K = 10000;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();        
        int[] count = new int[2 * MAX_K + 1];
        int[] countL = new int[2 * MAX_K + 1];
        int[] countR = new int[2 * MAX_K + 1];

        int cur = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            
            int start = 0;
            int end = 0;

            if(d == 'R'){
                while(x-- > 0){
                    count[cur] = 2;
                    countR[cur]++;
                    if(x>0) cur++;
                }
            }
            else{
                while(x-- >0){
                    count[cur] = 1;
                    countL[cur]++;
                    if(x>0) cur++;
                }
            }
        }
        // 문제는 같은 방향으로 총 4번 있는 거는 어떻게 표현할 것인가?
        int greyCount = 0;
        int whiteCount = 0;
        int blackCount = 0;

        for(int i = 0; i < 2 * MAX_K; i++){
            if(countL[i] >= 2 && countR[i] >= 2){
                greyCount++;
            }else if(count[i] == 1 ) whiteCount++;
            else if(count[i] == 2) blackCount
        }

        System.out.println(whiteCount + " " + blackCount + " " + greyCount);
    }
}