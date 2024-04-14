import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //동서남북 
        int[] dx = new int[]{1,-1,0,0};
        int[] dy = new int[]{0,0,-1,1};

        int x = 0;
        int y = 0;
        int p = 0;

        for (int i = 0; i<n; i++){
            char dir = sc.next().charAt(0);
            int dis = sc.nextInt();

            switch(dir) {
                case 'E':
                    p = 0;
                    break;
                case 'W':
                    p = 1;
                    break;
                case 'S':
                    p = 2;
                    break;
                case 'N':
                    p = 3;
                    break;
                default:
                    System.out.print("?");
                    break;
            }

            x += dx[p] * dis;
            y += dy[p] * dis;
        }

        System.out.print(x+" " +y);

    }
}