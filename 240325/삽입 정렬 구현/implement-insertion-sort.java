import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            int t = sc.nextInt();
            arr[i] = t;
        }
        sort(arr);

        for (int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void sort(int[] temp){

        for (int i = 1; i<temp.length; i++){
            int j = i-1;

            int key = temp[i];

            while(j>=0 && temp[j] > key){
                temp[j+1] = temp[j];
                j--;
            }

            temp[j+1] =key;

        }
    }
}