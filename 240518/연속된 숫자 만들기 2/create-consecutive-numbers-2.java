import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i<3; i++){
            arr[i] = sc.nextInt();
        }

        int cnt = 0;

        while(cnt < 3){
            Arrays.sort(arr);

            int dif = arr[1] - arr[0];
            int diff = arr[2] - arr[1];

            if(dif == 1 && diff == 1){
                break;
            }

            if(dif == 2 || diff == 2){
                cnt++;
                break;
            }

            //앞 중간에 낌
            if (dif < diff && dif !=1){
                int newN = arr[1] - dif / 2;
                arr[2] = newN;
                cnt++;
            }

            // 뒤 중간에 낌
            else{
                int newN = arr[2] - diff / 2;
                arr[0] = newN;
                cnt++;
            }

            // for (int i = 0; i<3; i++){
            //     System.out.print(arr[i]);
            // }
            // System.out.println();
        }

        System.out.print(cnt);
        

        

    }
}