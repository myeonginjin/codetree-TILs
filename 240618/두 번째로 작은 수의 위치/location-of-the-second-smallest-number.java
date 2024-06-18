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

        if(sortArr.get(0) != sortArr.get(1)) {
            if(sortArr.size() >=3 && sortArr.get(1) != sortArr.get(2)) {
                index = arr.indexOf(sortArr.get(1)+1);
            } 
            else{
                index = 2;
            }
        }
        System.out.print(index);


        




    }
}