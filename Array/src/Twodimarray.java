import java.util.Scanner;

public class Twodimarray {
    public static void main(String[] args) {
        int [][]marks = new int[100][100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row:");
        int r = sc.nextInt();
        System.out.println("Enter the column:");
        int c = sc.nextInt();
        System.out.println("Enter the array in 2D");
        for(int i = 0 ;i<r;i++){
            for(int j = 0;j<c;j++){
                marks[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("The 2D array");
        for(int i = 0 ;i<r;i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
