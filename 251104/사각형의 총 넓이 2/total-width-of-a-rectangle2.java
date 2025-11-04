import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int MAX_N = 10;
        int OFFSET = 200;

        int[] x1 = new int[MAX_N];
        int[] y1 = new int[MAX_N];
        int[] x2 = new int[MAX_N];
        int[] y2 = new int[MAX_N];

        int[][] arr = new int[OFFSET+1][OFFSET+1];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt() + OFFSET/2;
            y1[i] = sc.nextInt() + OFFSET/2;
            x2[i] = sc.nextInt() + OFFSET/2;
            y2[i] = sc.nextInt() + OFFSET/2;

            for(int j = x1[i]; j < x2[i]; j++){
                for(int z = y1[i]; z < y2[i]; z++){
                    arr[j][z] = 1;
                }
            }
        }

        int count = 0;
        for(int j = 0; j <= OFFSET; j++){
                for(int z = 0; z <= OFFSET; z++){
                    if(arr[j][z] == 1){
                        count++;
                    }
            }
        }
        System.out.println(count);
    }
}