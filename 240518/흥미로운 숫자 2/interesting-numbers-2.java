import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int cnt = 0;
        for (int i = x; i<=y; i++){
            if(check(i)){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
    public static boolean check(int num){
        String nStr = String.valueOf(num);
        ArrayList<Integer> arr = new ArrayList<>();
        int[] cnt = new int[10];
        
        for (int i = 0; i<nStr.length(); i++){
            if(arr.size() > 2) return false;

            int c = Integer.parseInt(nStr.substring(i,i+1));

            if(!arr.contains(c)){
                arr.add(c);
                
            }
            cnt[c] += 1;
        }

        // for (int i = 0; i<arr.size(); i++){
        //     System.out.print(arr.get(i)+" ");
        // }
        // System.out.println();

        // for (int i = 0; i<cnt.length; i++){
        //     System.out.print(cnt[i]+" ");
        // }
        // System.out.println();

        boolean ans = false;

        if(arr.size() > 2) return false;

        for (int i = 0; i<10; i++){
            if (cnt[i] == nStr.length()-1 || cnt[i] == 1 || cnt[i] == 0) ans = true;
            else {
                return false;
            }
        }

        return ans;
    }
}