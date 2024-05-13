import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2001];

        int curX = 1000;

        for (int i = 0; i<n; i++){
            int dis = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'R'){
                for (int j = curX; j<=curX+dis; j++){
                    arr[j]+=1;
                    
                }
                curX += dis;
            }
            else {
                for (int j = curX; j>=curX-dis; j--){
                    arr[j]+=1;
                    
                }
                curX -= dis;
            }
        }
        int ansCnt = 0; 
        int cnt = 0;
        boolean overTwoArea = false;

        for (int i = 0; i<arr.length; i++){

            //2번 이상 지나간 구간이 끝났음
            if (overTwoArea && arr[i] < 2) {
                ansCnt += cnt;
                cnt = 0;
                overTwoArea = false;
            }

            //2번 이상 지나간 구간을 지나고 있음
            if (overTwoArea && arr[i]>=2){
                cnt++;
            }

            //2번 이상 지나간 구간이 시작되었음
            if(!overTwoArea && arr[i]>=2){
                overTwoArea = true;
            }

            // if (arr[i] > 0 ){
            //     System.out.print(arr[i] +" ");
            // }

        }

        System.out.print(ansCnt);


    }
}