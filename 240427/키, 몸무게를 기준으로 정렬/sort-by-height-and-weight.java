import java.util.Scanner;
import java.util.Arrays;

class Stu implements Comparable<Stu> {
    String name;
    int cm,kg;

    public Stu(String str, int c, int k) {
        this.name = str;
        this.cm = c;
        this.kg = k;
    }

    public int compareTo(Stu s) {
        if (this.cm == s.cm) {
            return s.kg - this.kg;
        }
        return this.cm - s.cm;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stu[] arr = new Stu[n];

        for (int i =0; i<n; i++){
            String str = sc.next();
            int c = sc.nextInt();
            int k = sc.nextInt();

            arr[i] = new Stu(str, c, k);    
        }

        Arrays.sort(arr);

        for (int i = 0; i<n; i++){
            Stu s = arr[i];
            System.out.println(s.name+" "+s.cm+" "+s.kg);
        }
    }
}