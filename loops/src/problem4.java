import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 10 ;i>=1 ;i--){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
}
