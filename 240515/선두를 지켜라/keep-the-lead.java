import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] aRecord = new int[1000001];
        int[] bRecord = new int[1000001];


        int aArea= 0;
        int aIndex = 1;
        for (int i = 0; i<n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            
            int time = aArea;
            for (int j = time+1; j<=time+t; j++){
                aArea += v;
                aRecord[aIndex++] = aArea;
            }   
        }

        int bArea= 0;
        int bIndex = 1;
        for (int i = 0; i<m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            
            int time = bArea;
            for (int j = time+1; j<=time+t; j++){
                bArea += v;
                bRecord[bIndex++] = bArea;
            }   
        }

        char winner = 'c';
        if (aRecord[1] > bRecord[1]){
            winner = 'a';
        }
        else if (aRecord[1] < bRecord[1]){
            winner = 'b';
        }

        int cnt = 0;
        for (int i = 2; i<aRecord.length; i++){
            char win = winner;
            if (aRecord[i] > bRecord[i]){
                win = 'a';
            }
            else if (aRecord[i] < bRecord[i]){
                win = 'b';
            }

            if (winner != win){
                cnt++;
                winner = win;
            }
        }

        // for (int i= 0; i<15; i++){
        //     System.out.print(aRecord[i]+" ");
        // }
        // System.out.println();
        // for (int i= 0; i<15; i++){
        //     System.out.print(bRecord[i]+" ");
        // }

        System.out.print(cnt);
        

    }
}