import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        while(n>0){
            arr.add(n%div);
            n /= div;
        }

        for (int i = arr.size()-1; i>=0; i--){
            System.out.print(arr.get(i));
        }
    }
}