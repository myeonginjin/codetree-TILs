import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < N; i++){
            String command = sc.next();

            if(command.equals("push_back")){
                int num = sc.nextInt();
                arr.add(num);
            }
            else if(command.equals("pop_back")){
                arr.remove(v.size()-1);
            }else if(command.equals("size")){
                System.out.println(arr.size());
            }else{
                int index = sc.nextInt();
                System.out.println(arr.get(index - 1));
            }

        }



    }
}