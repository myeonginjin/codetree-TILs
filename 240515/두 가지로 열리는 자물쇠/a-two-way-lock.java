import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        ArrayList[] firArr = new ArrayList[3];
        ArrayList[] secArr = new ArrayList[3];

        for (int i = 0; i<3; i++){
            int num = sc.nextInt();
            boolean[] exist = new boolean[range+1];

            ArrayList<Integer> t = new ArrayList<>();
            for (int j = num; j<=num+2; j++){
                int temp = j % range;
                if(temp==0) temp = range;
                
                if(!exist[temp]){
                    t.add(temp);
                    exist[temp] = true;
                }
                
            }
            for (int j = num-1; j>=num-2; j--){
                int temp = ((range + j) % range);
                if(temp==0) temp = range;
                if(!exist[temp]){
                    t.add(temp);
                    exist[temp] = true;
                }
            }
            firArr[i] = t;
        }

        for (int i = 0; i<3; i++){
            int num = sc.nextInt();
            boolean[] exist = new boolean[range+1];
            ArrayList<Integer> t = new ArrayList<>();
            for (int j = num; j<=num+2; j++){
                int temp = j % range;
                if(temp==0) temp = range;
                if(!exist[temp]){
                    t.add(temp);
                    exist[temp] = true;
                }
            }
            for (int j = num-1; j>=num-2; j--){
                int temp = ((range + j) % range);
                if(temp==0) temp = range;
                if(!exist[temp]){
                    t.add(temp);
                    exist[temp] = true;
                }
            }
            secArr[i] = t;
        }


        int maxCnt = firArr[0].size() * firArr[1].size() * firArr[2].size() + 
        secArr[0].size() * secArr[1].size() * secArr[2].size();

        int totalDuf = 1;

        for (int i = 0; i<3; i++){
            boolean[] check = new boolean[range+1];
            int duf = 0;
            ArrayList<Integer> t = firArr[i];
            ArrayList<Integer> t2 = secArr[i];

            for (int j = 0; j<firArr[i].size(); j++){
                
                check[t.get(j)] = true;
            }

            for (int j = 0; j<secArr[i].size(); j++){
                
                if(check[t2.get(j)]) {
                    duf++;
                }
            }
            totalDuf *= duf;
        }

        System.out.print(maxCnt-totalDuf);

    }
}