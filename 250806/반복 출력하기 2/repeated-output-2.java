import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        func(n);
    }

    static void func(int n){
        if(n == 0){
            return ;
        }else{
            System.out.println("HelloWorld");
            func(--n);
        }
    }
}