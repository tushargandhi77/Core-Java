import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        int i=0;
        Scanner sc = new Scanner(System.in);
        while(flag){
            try {
                System.out.println("Enter the index:");
                int index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
//                System.out.println(e);
                i++;
            }
        }
    }
}
