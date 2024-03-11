import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String str = sc.next();

        LinkedList<Character> arr = new LinkedList<>();

        
        for (int i = 0; i<str.length(); i++){
            arr.add(str.charAt(i));
        }

        ListIterator<Character> t = arr.listIterator(arr.size());
        

        for (int i = 0; i<m; i++){
            String q = sc.next();

            if (q.equals("L")){

                if(t.hasPrevious()) {
                    t.previous();

                }
            }
            else if (q.equals("P")){
                String s = sc.next();
                char c = s.charAt(0);
                t.add(c);
            }
            else if (q.equals("D")){
                if(t.hasNext()) {
                    t.next();
                    t.remove();
                }
            }
            else if (q.equals("R")){
                if(t.hasNext()) t.next();
            }
        }

        t = arr.listIterator();

        while(t.hasNext()){
            System.out.print(t.next());
        }


        
    }
}