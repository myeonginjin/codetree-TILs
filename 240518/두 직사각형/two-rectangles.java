import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        String ans = "";

        int minR = Math.min(x1,a1);
        int maxR = Math.max(x2,a2);

        int minC = Math.min(y1,b1);
        int maxC = Math.max(y2,b2);

        boolean fail = true;

        //좌우로 닿지않는 상황
        if(a2<x1 || a1 > x2){

            fail = false;
        }

        //위아래로 닿지않는 상황
        if(b1 > y2 || b2<y1){
            fail = false;
        } 

        if(fail){
            ans += "overlapping";
        }
        else {
            ans += "nonoverlapping";
        }
        System.out.print(ans);

    }
}