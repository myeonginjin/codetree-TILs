import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> d = new ArrayDeque<>();

        int n = sc.nextInt();

        for (int i  = 0; i<n; i++ ) {
            String t = sc.next();
            int num = -1;

            switch (t) {
                case "push_front" :
                num = sc.nextInt();
                d.offerFirst(num);
                break;
                case "push_back"  :
                num = sc.nextInt();
                d.offerLast(num);
                break;
                case "pop_front" :
                sb.append(d.pollFirst()+"\n");
                break;
                case "pop_back" :
                sb.append(d.pollLast()+"\n");
                break;
                case "size" :
                sb.append(d.size()+"\n");
                break;
                case "empty" :
                int temp = d.isEmpty() ? 1 : 0;
                sb.append(temp+"\n");
                break;
                case "front" :
                sb.append(d.peekFirst()+"\n");
                break;
                case "back" :
                sb.append(d.peekLast()+"\n");
                break;
            }
        }
        System.out.println(sb);
    }
}