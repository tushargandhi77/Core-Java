import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int [] marks = new int[5];
//        marks[0] = 100;
//        marks[1] = 40;
//        marks[2] = 70;
//        marks[3] = 90;
//        marks[4] = 86;
//        System.out.println(marks[4]);

//         int [] marks = {90,45,79,99,80};
//        System.out.println(marks.length);

        int [] marks = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array:");
        for(int i = 0 ;i<n;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("The array:");
//        for(int i = 0;i<n;i++){
//            System.out.println(marks[i]);
//        }
        for(int element: marks){
            System.out.println(element);
        }
    }
}