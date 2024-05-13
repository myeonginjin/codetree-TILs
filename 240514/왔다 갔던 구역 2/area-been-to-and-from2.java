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
                for (int j = curX+1; j<curX+dis; j++){
                    arr[j]+=1;
                    
                }
                curX += dis;
            }
            else {
                for (int j = curX-1; j>curX-dis; j--){
                    arr[j]+=1;
                    
                }
                curX -= dis;
            }
        }
        int cnt = 0; 
        for (int i = 0; i<arr.length; i++){
            if(arr[i]>=2){
                cnt++;
            }
        }

        System.out.print(cnt);


    }
}