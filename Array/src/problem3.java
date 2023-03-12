import java.util.Scanner;

public class problem3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject:");
        int n = sc.nextInt();
        float [] marks = new float[n];
        float sum = 0;
        System.out.println("Enter the marks :");
        for(int i = 0;i<n;i++){
            marks[i] = sc.nextFloat();
        }
        for(int i = 0;i<n;i++){
            sum += marks[i];
        }
        System.out.println("The average: "+(sum/n));
    }
}