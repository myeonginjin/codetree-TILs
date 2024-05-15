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

        for (int i = 0; i<n-1; i++){
            int dis = 0;
            for (int j = i+1; j<n; j++){
                int xDif = x[i] - x[j];
                int yDif = y[i] - y[j];

                dis = xDif*xDif + yDif*yDif;

                minDis = Math.min(dis, minDis);
            }
            
        }

        System.out.print(minDis);
    }
}