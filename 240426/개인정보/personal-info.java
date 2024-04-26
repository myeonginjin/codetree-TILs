import java.util.*;


class People implements Comparable<People> {
    String name;
    int cm;
    double kg;

    public People(String n, int c, double k) {
        this.name = n;
        this.cm = c;
        this.kg = k;
    }

    public int compareTo (People p){
            return this.name.compareTo(p.name);
    }
}

class Peoplee implements Comparable<Peoplee> {
    String name;
    int cm;
    double kg;

    public Peoplee(String n, int c, double k) {
        this.name = n;
        this.cm = c;
        this.kg = k;
    }

    public int compareTo (Peoplee p){
            return p.cm - this.cm;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        People[] arr = new People[5];
        Peoplee[] arr2 = new Peoplee[5];

        for (int i = 0; i<5; i++){
            String name = sc.next();
            int cm = sc.nextInt();
            double kg = sc.nextDouble();

            arr[i] = new People(name, cm, kg);
            arr2[i] = new Peoplee(name, cm, kg);
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println("name");
        for (int i = 0; i<5; i++){
            People p = arr[i];
            System.out.printf("%s %d %.1f",p.name, p.cm, p.kg);
            System.out.println();
        }

        System.out.println();
        System.out.println("height");
        for (int i = 0; i<5; i++){
            Peoplee p = arr2[i];
            System.out.printf("%s %d %.1f",p.name, p.cm, p.kg);
            System.out.println();
        }


    }
}