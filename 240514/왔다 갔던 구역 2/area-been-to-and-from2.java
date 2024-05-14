import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2001];

        int curX = 1000;
        char orijinDir = 'N';

        for (int i = 0; i<n; i++){
            int dis = sc.nextInt();
            char dir = sc.next().charAt(0);


            if (dir == 'R'){
                for (int j = curX; j<curX+dis; j++){
                    arr[j]+=1;
                    
                }
                curX += dis-1;
            }
            else {
                for (int j = curX; j>curX-dis; j--){
                    arr[j]+=1;
                    
                }
                curX -= dis-1;
            }

            orijinDir = dir;

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
            else if (overTwoArea && arr[i]>=2){
                cnt++;
            }

            //2번 이상 지나간 구간이 시작되었음
            else if(!overTwoArea && arr[i]>=2){
                overTwoArea = true;
            }

            if (arr[i] > 0 ){
                System.out.print(arr[i] +" ");
            }

        }

        // System.out.println();

        // System.out.print(ansCnt);


    }
}

// 2 2 2 4 4 4 4 5 4 4 3 2 2 4 5 4 5 6 4 4 5 5 5 4 5 4 4 4 4   ->29 -> 28 

// 1 1 1 1 1 3 3 3 4 ->3

// 1 1 1 1 2 1 2 1 
// 2 3 4 3 3 4 3 -> 6

// 1 1