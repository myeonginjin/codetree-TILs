import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int OFFSET = 100000;
        int n = sc.nextInt();

        int[] checked = new int[OFFSET * 2 + 1];
        int cur = OFFSET;

        // 신기한 타일 - 왼쪽으로 뒤집으면 흰색, 오른쪽으로 뒤집으면 검은색
        // 흰색, 검은색 타일 수를 각각 출력

        // 1은 흰색, 2는 검은색
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'L'){
                while(x-- > 0){
                    checked[cur] = 1;
                    if(x > 0) cur--;
                }
            }else{
                while(x-- > 0){
                    checked[cur] = 2;
                    if(x > 0) cur++;
                }
            }
        }

        int whiteCount = 0;
        int blackCount = 0;

        for(int i = 0; i <= OFFSET * 2; i++){
            if(checked[i] == 1) whiteCount++;
            else if(checked[i] == 2) blackCount++;
        }

        System.out.println(whiteCount + " " + blackCount);
    }
}