import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int OFFSET = 1000;
        int MAX_R = OFFSET * 2;

        int rect1_x1 = sc.nextInt() + OFFSET;
        int rect1_y1 = sc.nextInt()+ OFFSET;
        int rect1_x2 = sc.nextInt()+ OFFSET;
        int rect1_y2 = sc.nextInt()+ OFFSET;
        int rect2_x1 = sc.nextInt()+ OFFSET;
        int rect2_y1 = sc.nextInt()+ OFFSET;
        int rect2_x2 = sc.nextInt()+ OFFSET;
        int rect2_y2 = sc.nextInt()+ OFFSET;
        
 
        int[][] arr = new int[MAX_R + 1][MAX_R + 1];

        for(int i = rect1_x1; i<rect1_x2; i++){
            for(int j = rect1_y1; j<rect1_y2; j++){
                arr[i][j] = 1;
            }
        }

        for(int i = rect2_x1; i<rect2_x2; i++){
            for(int j = rect2_y1; j<rect2_y2; j++){
                arr[i][j] = 2;
            }
        }

        int maxX = 0;
        int minX = Integer.MAX_VALUE;
        int maxY = 0;
        int minY = Integer.MAX_VALUE;

        boolean fit = false;
        for(int i = 0; i<= MAX_R; i++){
            for(int j = 0; j<= MAX_R; j++){
                if(arr[i][j] == 1){

                    fit = true;
                    if(maxX < i) maxX = i;
                    if(maxY < j) maxY = j;

                    if(minX > i) minX = i;
                    if(minY > j) minY = j;
                }
            }
        }

        if(!fit){
            System.out.println(0);
        }
        //System.out.println(maxX + " " + maxY);
        //System.out.println(minX + " " + minY);
        System.out.println((maxX-minX+1) * (maxY-minY+1));
    }
}