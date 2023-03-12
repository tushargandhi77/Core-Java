import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        if(n==1 && n==1){
            fact = 1;
        }
        else{
            for(int i = 1 ;i<=n;i++){
                fact  = fact*i;
            }
        }
        System.out.println(fact);
    }
}
