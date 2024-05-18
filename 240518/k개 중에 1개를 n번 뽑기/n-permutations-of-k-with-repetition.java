import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int k = sc.nextInt();
    public static int n = sc.nextInt();
    public static ArrayList<Integer> arr = new ArrayList<>();

    public static void printArr(){
        for(int i = 0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        // for(int i = arr.size()-1; i>=0; i--){
        //     System.out.print(arr.get(i));
        // }
        // System.out.println();
    }


    public static void fillArray(int index){
        if(index == n){
            printArr();
            return;
        }
        for(int i = 1; i<=k; i++){
            arr.add(i);
            fillArray(index+1);

            arr.remove(arr.size()-1);
        }
    }
    
    public static void main(String[] args) {
        fillArray(0);
    }
}