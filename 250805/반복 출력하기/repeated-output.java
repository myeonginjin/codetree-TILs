import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }

    static void func(int a){
        
        for(int i = 0; i <a; i++){
            for(int j = 1; j<=5; j++){
                System.out.print(j);
            }
            System.out.println("^&*()_");
        }
    }
}