import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        int index_max = 0;
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();

            if(end[i] > index_max){
                index_max = end[i];
            }
        }

        int[] count = new int[index_max+1];

        for(int i = 0; i < n; i++){
            for(int j = start[i]; j <= end[i]; j++){
                count[j]++;
            }
        }


        int max = 0;

        for(int i = 0; i<index_max; i++){
            if(max < count[i]){
                max = count[i];
            }
        }
        System.out.println(max);
    }
}