import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("First N odd number");

        for (int i = 1;i<=n;i++){
            if(i%2!=0) {
                System.out.println(i);
            }
        }
    }
}
