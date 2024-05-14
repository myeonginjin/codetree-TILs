import java.util.Scanner;

public class Main {
    public static int[] arr = new int[101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i<n; i++){
            for (int j = i; j<n; j++){
                int sum = 0;
                for (int k = i; k<=j; k++){
                    sum += arr[k];
                }

                if(check(sum, i, j)) {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }

    public static boolean check(int s, int str, int las){

        
        double avg = s / (double)(las - str + 1);
        // if (s % (las - str +1) > 0){
        //     return false;
        // }


        boolean find = false;
        for (int i = str; i<=las; i++){
            if (arr[i] == avg) {

                find = true;
            }
        }
        return find;
    }
}