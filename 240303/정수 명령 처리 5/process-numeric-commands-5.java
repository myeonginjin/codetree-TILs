import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            String q = sc.next();

            if(q.equals("push_back")){
                int num = sc.nextInt();
                arr.add(num);

            }
            else if (q.equals("get")){
                int num = sc.nextInt();
                System.out.println(arr.get(num-1));
            }

            else if (q.equals("size")){
                System.out.println(arr.size());
            }
            else{
                arr.remove(arr.size()-1);
            }
        }
        


    }
}