import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayDeque<Integer> d = new ArrayDeque<>();

        for (int i = n; i>=1; i--) {
            d.offer(i);
        }

        while(d.size()>2) {
            d.pollFirst();
            int t = d.pollFirst();
            d.offerLast(t);
        }

        System.out.print(d.poll());
    }
}