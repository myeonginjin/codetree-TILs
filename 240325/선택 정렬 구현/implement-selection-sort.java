import java.util.Scanner;

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

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int[] array){

        
        for (int i = 0; i<array.length-1; i++){

            int min = array[i]; 
            int index = i;

            for (int j = i+1; j<array.length; j++){
                if(min > array[j]){
                    min = array[j];
                    index = j;
                } 
            }

            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
            

        }
        
    }
}