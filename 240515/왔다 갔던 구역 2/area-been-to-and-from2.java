import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[2001];
        // int offset = 1000;
        int point = 1000;

        for (int i = 0; i<n; i++){
            int dis = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'R'){
                for (int s = point; s<point+dis; s++){
                    arr[s] += 1;
                }
                point += dis;
            }

            else {
                for (int s = point-dis; s<point; s++){
                    arr[s] += 1;
                }
                point -= dis;
            }
        }
        int cnt = 0;
        for (int i = 0; i<arr.length; i++){
            if(arr[i] >= 2) cnt++;
        }

        System.out.print(cnt);
    }
}