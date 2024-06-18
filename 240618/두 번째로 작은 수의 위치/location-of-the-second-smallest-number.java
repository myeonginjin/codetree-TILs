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

            arr.add(num);
        }

        List<Integer> sortArr = new ArrayList(arr);
        Collections.sort(sortArr);
        
        int index = -1;
        int minElm = sortArr.get(0);
        int ans = -1;

        for (int i = 1; i<sortArr.size(); i++){
            if (ans != -1 && ans == sortArr.get(i)) {
                ans = -1; 
                System.out.print(-1);
                System.exit(0);
            }
            else if (ans == -1 && minElm != sortArr.get(i)) {
                ans = sortArr.get(i);
            }
        }
        // if (ans != -1){
        //     System.out.print(arr.indexOf(ans)+1);
        // }
        // else{
        //     System.out.print(-1);
        // }

        if (ans == -1){
            System.out.print(-1);
            System.exit(0);
        }

        System.out.print(arr.indexOf(ans)+1);




    }
}