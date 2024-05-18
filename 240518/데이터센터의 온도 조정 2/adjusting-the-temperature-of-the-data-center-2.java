import java.util.Scanner;

public class Main {
    public static int n,c,g,h;
    public static int[][] arr = new int[1000][2];
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();

        

        int minta = 10001;
        int maxtb = -1;

        for (int i = 0; i<n; i++){
            int ta = sc.nextInt();
            int tb = sc.nextInt();
            arr[i][0] = ta;
            arr[i][1] = tb;

            maxtb = Math.max(maxtb, tb);
            minta = Math.min(minta, ta);
        }


        int maxTask = 0;

        //온도 범위
        for (int i = 0; i<=maxtb+1; i++) {
            //작업량 가져오기
            int task = getTask(i);
            maxTask =  Math.max(task, maxTask);
        }
        System.out.print(maxTask);
    }

    public static int getTask(int t) {
        int task = 0;

        for (int i = 0; i<n; i++){
            int tA = arr[i][0];
            int tB = arr[i][1];

            if (t < tA){
                task+=c;
            }
            else if ( tA <= t && t<= tB){
                task+=g;
            }
            else {
                task+=h;
            }
        }
        return task;
    }
}