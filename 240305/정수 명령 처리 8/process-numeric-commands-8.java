import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> arr = new LinkedList<>();

        int n = sc.nextInt();

        for (int i = 0; i<n; i++){


            String q = sc.next();
            int num = 0;
            switch (q) {

                case "push_back":
                    num = sc.nextInt();
                    arr.addLast(num);
                    break;

                case "push_front":
                    num = sc.nextInt();
                    arr.addFirst(num);
                    break;

                case "front":
                    System.out.println(arr.peekFirst());
                    break;

                case "pop_back":
                    System.out.println(arr.pollLast());
                    break;
                
                case "empty":
                    if (arr.isEmpty())System.out.println(1);
                    else System.out.println(2);
                    break;

                case "pop_front":
                    System.out.println(arr.pollFirst());
                    break;

                case "back":
                    System.out.println(arr.peekLast());
                    break;

                case "size":
                    System.out.println(arr.size());
                    break;

                default :
                    break;
            }
        }
    }
}