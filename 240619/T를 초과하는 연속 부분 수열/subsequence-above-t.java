import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        } 

        int maxLen = 0;

        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++){
                
                boolean ok = true;

                for (int s = j; s<=j+i; s++) {
                    if(j+i >= n || arr[s] <= k) {
                        ok = false;
                        break;
                    }
                }
                
                if(ok) maxLen = Math.max(maxLen, i+1);

                if(ok && maxLen == 4) {
                    // for (k = j; k<=j+i; k++) {
                    //      System.out.print(arr[k]+" ");
                    // }
                    //System.out.println(i+" "+j);
                }
            
            }
        }
        
        System.out.print(maxLen);
    }
}