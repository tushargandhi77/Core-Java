
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>18){
            System.out.println("yes you drive");
        }
        else{
            System.out.println("NO boy you cant drive");
        }
    }
}