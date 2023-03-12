import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int []marks = new int[n];
        System.out.println("Enter the element want to search:");
        int s = sc.nextInt();
        System.out.println("Enter the element of array:");
        for(int i = 0;i<n;i++){
            marks[i] = sc.nextInt();
        }
        boolean isinarray = false;
        for(int i = 0;i<n;i++) {
            if (s == marks[i]) {
                isinarray = true;
                break;
            }
        }
        if(isinarray){
            System.out.println("The value present");
        }
        else{
            System.out.println("The value not present");
        }
    }
}
