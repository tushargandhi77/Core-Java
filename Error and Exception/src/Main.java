import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        // 1.syntax error
        // int a = 0 // Error : semicolon

        // 2.Logical error
         //print prime number
        System.out.println(2);
        for(int i = 1;i<5;i++){
            System.out.println(2*i+1);
        }

        // Runtime error
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Interger  part of 1000 divided by k is "+ 1000/k);
    }
}