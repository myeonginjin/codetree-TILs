import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = 0, cnt = 0;

        for(int i = 0; i<n; i++){

            // 연속해서 음수인 것을 찾아야 하는데, 앞 뒤를 비교하는게 있어야 함
            // 양수
            if( i == 0 || arr[i] > 0 && arr[i-1] > 0){
                cnt++;
            }
            // 음수
            else if(i == 0|| arr[i] < 0 && arr[i-1] < 0){
                cnt++;
            }
            else cnt = 1;

            ans = Math.max(ans, cnt);

        }
        System.out.println(ans);
    }
}