import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.

        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}