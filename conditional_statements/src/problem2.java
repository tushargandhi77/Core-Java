import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter you marks in physics");
        int m1 = sc.nextInt();
        System.out.println("Enter your marks in Chemistry");
        int m2 = sc.nextInt();
        System.out.println("Enter your marks in mathematics");
        int m3 = sc.nextInt();

        float avg = (m1+m2+m3)/3.0f;
        if(avg >=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulation you are passed");
        }
        else{
            System.out.println("you failed");
        }
    }
}
