import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.printf("a is %d and b is %d\n",a,b);
        System.out.format("a is %d and b is %d\n",a,b);
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
    }
}