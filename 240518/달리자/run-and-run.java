import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] pre = new int[n];
        int[] aft = new int[n];

        for (int i = 0; i<n; i++){
            pre[i] = sc.nextInt();
        }
        for (int i = 0; i<n; i++){
            aft[i] = sc.nextInt();
        }

        int cnt = 0;

        for(int i = n-1; i>=0; i--){
            int dif = aft[i] - pre[i];
            if(dif == 0) continue;

            // System.out.println(dif);

            for (int j = i-1; j>=0; j--){
            
                if(dif==0) break;
                if(pre[j] == 0) continue;

                int d = pre[j];

                
                if(dif>=d){
                    dif -= d;
                    pre[j] = 0;
                    cnt += (d* (i-j));
                    pre[i] += d;
                }
                else {
                    
                    pre[j] = d - dif;
                    pre[i] += dif;

                    //System.out.println(pre[j]+" "+j+" ");
                    cnt += (dif * (i-j));
                    // System.out.println(cnt);

                    dif = 0;
                }
            }

            // for(int k = 0; k<n; k++){
            //     System.out.print(pre[k]+" ");
            // }
            // System.out.println();
        }

        System.out.print(cnt);
    }
}