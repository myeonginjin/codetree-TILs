import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String n = sc.next();

        int tenN = 0;
        int mul = 1;

        for (int i = n.length()-1; i>=0; i--){
            tenN += mul * Integer.parseInt(n.substring(i,i+1));
            mul *= a;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        // System.out.println(tenN);

        while(tenN > 0) {
            arr.add(tenN % b);
            tenN /= b;
        }

        for (int i = arr.size()-1; i>=0; i--){
            System.out.print(arr.get(i));
        }

    }
}