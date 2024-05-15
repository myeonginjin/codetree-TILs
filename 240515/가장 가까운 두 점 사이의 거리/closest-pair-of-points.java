import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i<n; i++){
            int n1= sc.nextInt();
            int n2 = sc.nextInt();
            x[i] = n1;
            y[i] = n2;
        }

        int minDis = Integer.MAX_VALUE;

        for (int i = 0; i<n; i++){
            int dis = 0;
            for (int j = 0; j<n; j++){
                if(i==j) continue;
                int xDif = Math.abs(x[i] - x[j]);
                int yDif = Math.abs(y[i] - y[j]);

                dis = (int)(Math.pow(xDif,2)) + (int)(Math.pow(yDif,2));
            }
            minDis = Math.min(dis, minDis);
        }

        System.out.print(minDis);
    }
}