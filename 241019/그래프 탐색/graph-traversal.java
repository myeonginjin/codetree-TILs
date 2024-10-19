import java.util.Scanner;


public class Main {
    public static  Scanner sc = new Scanner(System.in);
    public static int n = sc.nextInt();
    public static int m = sc.nextInt();
    public static int[][] arr = new int[n+1][n+1];
    public static int ansCnt = 0;
    public static boolean[] choosed = new boolean[n+1];

    public static void move(int startNode){
        for (int i = 1; i<=n; i++){
            if(arr[startNode][i]==1 && !choosed[i]){
                ansCnt++;
                choosed[i] = true;
                move(i);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i<m; i++){
            int startNode = sc.nextInt();
            int endNode = sc.nextInt();

            arr[startNode][endNode] = 1;
            arr[endNode][startNode] = 1;
        }
        choosed[1] = true;
        move(1);
        System.out.print(ansCnt);

    }
}


// import java.util.Scanner;
// import java.util.ArrayList;

// public class Main {
//     public static Scanner sc = new Scanner(System.in);
//     public static int n = sc.nextInt();
//     public static int m = sc.nextInt();
//     public static ArrayList<Integer>[] arrL = new ArrayList[n+1];
//     public static boolean[] choosed = new boolean[n+1];
//     public static int ans = 0;

//     public static void testFx(int parNode){
//         for (int i = 0;  i < arrL[parNode].size(); i++ ){
//             int nextNode = arrL[parNode].get(i);
//             if(!choosed[nextNode]){
//                 choosed[nextNode] = true;
//                 ans++;
//                 testFx(nextNode);
//             }
            
//         }
//     }

//     public static void main(String[] args) {
//         int[] startNode = new int[m];
//         int[] endNode = new int[m];

//         for (int i = 1; i<=n; i++){
//             arrL[i] = new ArrayList<>();
//         }

//         for (int i = 0; i<m; i++){
//             startNode[i] = sc.nextInt();
//             endNode[i] = sc.nextInt();
//         }

//         for (int i =0; i<m; i++){
//             int start = startNode[i];
//             int end = endNode[i];

//             arrL[start].add(end);
//             arrL[end].add(start);
//         }

//         choosed[1] = true;
//         testFx(1);
//         System.out.print(ans);


        
//     }
// }