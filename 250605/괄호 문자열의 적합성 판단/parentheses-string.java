import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Stack<String> s = new Stack<>();

        for (int i = 0; i<str.length(); i++) {
            String t = str.substring(i, i+1);

            if(t.equals("(")) s.push(t);
            else {
               if(!s.isEmpty()) s.pop();
            }
        }        

        String ans = s.isEmpty() ? "Yes" : "No";

        System.out.println(ans);
    }
}