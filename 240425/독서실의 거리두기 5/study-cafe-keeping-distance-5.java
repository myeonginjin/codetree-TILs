import java.util.Scanner;

public class Main {
    public static int n;
    public static int chair[] = new int[20];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        for (int i = 0; i<str.length(); i++){
            chair[i] = Integer.parseInt(str.substring(i,i+1));
        }

        int maxDis = 0;
        for (int i = 0; i<n; i++){
            if(chair[i] != 1) {
                chair[i] = 1;
                maxDis = Math.max(checkDis(), maxDis);
                chair[i] = 0;
                
            }
            
        }

        System.out.print(maxDis);
    }

    public static int checkDis() {

        int minDis = 20;
        int dis = 0;
        for (int i = 1; i<chair.length; i++){
            
            if(chair[i] != 1){
                dis++;
            }
            else{
                minDis = Math.min(minDis, dis);
                dis = 0;
            }
        }

        return minDis+1;
    }
}