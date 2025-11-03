import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int OFFSET = 1000;
        int maxN = N + 100;
        int maxR = 2000;
        int[] count = new int[maxR + 1];
        int[] start = new int[maxN];
        int[] end = new int[maxN];
        int cur = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            // 현재 위치 부터 다음 위치까지가 필요
            if(dir == 'L'){
                start[i] = cur - x;
                end[i] = cur;
                cur -= x;
            }

            if(dir == 'R'){
                start[i] = cur;
                end[i] = cur + x;
                cur += x;
            }

            start[i] += OFFSET;
            end[i] += OFFSET;
        }

        for(int i = 0; i< N; i++){
            for(int j = start[i]; j < end[i]; j++){
                count[j]++;
            }
        }
        
        int answer = 0;
        for(int i = 0; i<=2000; i++){
            if(count[i] >= 2){
                answer++;
            }
        }

        System.out.println(answer);
    }
}