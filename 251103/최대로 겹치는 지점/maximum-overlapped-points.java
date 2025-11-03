import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        int maxN = 100 + n;

        // 몇개의 선분이 겹치는가?
        // 끝점이 닿는 경우도 겹친다
        int[] count = new int[maxN];

        for(int i = 0; i<n; i++){
            for(int j = start[i]; j <= end[i]; j++){
                count[j]++;
            }
        }

        int max = 0;

        for(int i = 0; i<maxN; i++){
            if(max < count[i]) max = count[i]; 
        }

        System.out.println(max);
    }
}