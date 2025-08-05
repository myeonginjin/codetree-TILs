import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code he
        func(n);
    }

    static void func(int num){
        int a = 1;
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                System.out.print(a + " ");
                a = a % 10;
                a++;
                if(a == 10){
                    a = 1;
                }
            }
            System.out.println();
        }
    }
}