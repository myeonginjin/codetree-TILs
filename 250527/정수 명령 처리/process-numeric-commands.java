import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i<n; i++) {
            String t = sc.next();
            
            switch (t) {
                case "push" :
                    int tt = sc.nextInt();
                    s.push(tt);
                    break;


                case "size" :
                    System.out.println(s.size());
                    break;

                case "pop" :
                    System.out.println(s.pop());
                    break;

                case "empty" :
                    if(s.isEmpty()) System.out.println(1);
                    else  System.out.println(0);
                    break;

                case "top" :
                    System.out.println(s.peek());
                    break;

                
            }
        }
        
    }
}