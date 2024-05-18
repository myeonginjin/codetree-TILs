import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i<n; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }

        int minDif = Integer.MAX_VALUE;

        // 2배할 숫자 인덱스 
        for (int i = 0; i<n; i++){
            
            //제거할 숫자 인덱스
            for (int j = 0; j<n; j++){
                if(i ==j) continue;


                ArrayList<Integer> newArr = new ArrayList<>();

                for (int k = 0; k<n; k++){
                    if(k==i) {
                        newArr.add(arr[k]*2);
                        continue;
                    }

                    if(k==j) {
                        continue;
                    }

                    newArr.add(arr[k]);
                }
                int dif = getDif(newArr);
                minDif = Math.min(dif, minDif);

                // if(i == 3 && j ==0){
                //     System.out.println(dif);
                // for (int s = 0; s< newArr.length; s++){
                //     System.out.print(newArr[s]+" ");
                // }
                // System.out.println();
                // }


            }
        }
        System.out.print(minDif);
    }

    public static int getDif(ArrayList<Integer> ar ){
        int sum = 0;

        for (int i = 1; i<ar.size(); i++){

            sum += Math.abs(ar.get(i-1) - ar.get(i));

        }

        // if (sum == 13){
        //     for (int i = 0; i<ar.length; i++){
        //         System.out.print(ar[i]+" ");
        //     }
        //     System.out.println();
        // }

        return sum;
    }
}