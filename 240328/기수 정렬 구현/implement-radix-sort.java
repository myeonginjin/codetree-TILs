import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] nums = new int[n];


        for (int i = 0; i<n; i++){
            int t = sc.nextInt();
            nums[i] = t;
        }

        sort(nums);

        for (int i = 0; i<n; i++){
            System.out.print(nums[i]+" ");
        }

    }

    public static void sort(int[] ns){

    
        int t = 1; 
        for (int k = 0; k<6; k++){
            
            ArrayList<Integer>[] arr = new ArrayList[10];

            for (int i = 0; i<10; i++){
            arr[i] = new ArrayList<>();
            }


            for (int i = 0; i<ns.length; i++){
                int num = ns[i];
                arr[num % (10*t)].add(ns[i]);

            }  

            // for (int i = 0; i<9; i++){
            //     for (int j = 0; j<arr[i].size(); j++){
            //         System.out.print(arr[i].get(j)+" ");
            //     }
            //     System.out.println();
            // }
            
            int index = 0; 
            for (int i =0; i<9; i++){

                for (int j = 0; j<arr[i].size(); j++){
                    ns[index++] = arr[i].get(j);
                }
            }

            t *= 10;

            
        }


        

    }
}