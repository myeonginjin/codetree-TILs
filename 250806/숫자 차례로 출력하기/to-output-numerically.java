import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
        System.out.println();
        func2(n);
    }

    static void func(int n){
        if(n == 0){
            return;
        }
        
        func(n-1);
        System.out.print(n + " ");
    }

    
    static void func2(int n){
        if(n == 0){
            return;
        }

        System.out.print(n+ " ");
        func2(n-1);
    }
}