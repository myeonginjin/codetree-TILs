import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();   

        //int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            int num = sc.nextInt();

            arr.add(n);
        }

        int ans = -1;


        int cnt = 1;

        int[] minNums = new int[2];
        int minNum;

        while (cnt--> 0) {
            minNum = 101;
            for (int i = 0; i<arr.size(); i++){
                minNum = Math.min(arr.get(i),minNum);
            }
            minNums[cnt] = minNum; 
        }

        if(minNums[0] != 0 || minNums[0]!=minNums[1]) {
            System.out.print(minNums[0]);
            
        }
        else{
            System.out.print(ans);
        }
    }
}