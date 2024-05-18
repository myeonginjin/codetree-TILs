import java.util.*;

public class Main {
    public static int n,k;
    public static ArrayList<Integer> arr = new ArrayList<>();

    public static void printArr(){
        for(int i = 0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }

    public static void backT(int index){
        

        if(index == n){
            printArr();
            return;
        }

        for (int i = 1; i<=k; i++){
            arr.add(i);
            backT(index+1);

            arr.remove(arr.size()-1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();

        backT(0);
    }
}