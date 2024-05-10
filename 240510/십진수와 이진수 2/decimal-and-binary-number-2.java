import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        int mul = 1;

        int num = 0;
        for (int i = n.length()-1; i>=0; i--){
            num += mul * Integer.parseInt(n.substring(i,i+1));
            mul *= 2;
        }

        num *= 17;

        ArrayList<Integer> arr = new ArrayList<>();

        while(num > 0){
            arr.add(num % 2);
            num /=2;
        }

        for (int i = arr.size()-1; i>=0; i--){
            System.out.print(arr.get(i));
        }
    }
}