import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();

        int sum = 0 ;

        for(int i = 0; i<binary.length(); i++){
            sum = sum * 2 + binary.charAt(i) - '0';
        }

        System.out.println(sum);

    }
}