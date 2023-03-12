import java.util.Scanner;

public class quiz

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 1 subject:");
        int m1 = sc.nextInt();
        System.out.println("Enter the marks of 2 subject:");
        int m2 = sc.nextInt();
        System.out.println("Enter the marks of 3 subject:");
        int m3 = sc.nextInt();
        System.out.println("Enter the marks of 4 subject:");
        int m4 = sc.nextInt();
        System.out.println("Enter the marks of 5 subject:");
        int m5 = sc.nextInt();
        double percent = (m1+m2+m3+m4+m5)*0.2;
        System.out.print("The percent:");
        System.out.print(percent);
        System.out.println(" %");
    }
}
