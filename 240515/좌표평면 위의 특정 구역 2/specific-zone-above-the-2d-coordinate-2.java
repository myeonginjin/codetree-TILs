import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i<n; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            x[i] = n1;
            y[i] = n2;
        }

        int minSize = Integer.MAX_VALUE;
        for (int i = 0; i<n; i++){
            int size = 0;

            int minX = 40001;
            int maxX = 0;
            int minY = 40001;
            int maxY = 0;

            for (int j = 0; j<n; j++){
                if(i==j) continue;

                maxX = Math.max(maxX, x[j]);
                minX = Math.min(minX, x[j]);

                maxY = Math.max(maxY, y[j]);
                minY = Math.min(minY, y[j]);
            }

            size = (maxY-minY) * (maxX-minX);
            // if(size == 0) continue;
            minSize = Math.min(minSize, size);
        }
        System.out.print(minSize);
    }
    
}