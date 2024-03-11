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

        
        



        char[] arr2 = str.toCharArray();


        for (int i = 0; i<str.length(); i++){
            arr.add(arr2[i]);
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
                    arr.remove();
                }
            }
            else if (q.equals("R")){
                if(t.hasNext()) t.next();
            }
        }

        for (int i = 0; i<arr.size(); i++){
            System.out.print(arr.get(i));
        }
        


        
    }
}