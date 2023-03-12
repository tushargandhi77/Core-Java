import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = sc.nextInt();


//        if(age>56){
//            System.out.println("You are experienced");
//        }
//        else if(age>46){
//            System.out.println("Your are semi-experienced");
//        }
//        else if(age>36){
//            System.out.println("You are semi-semi experienced");
//        }
//        else{
//            System.out.println("you are not experienced");
//        }

        switch (age) {
            case 18 -> System.out.println("You are going to become an Adult");
            case 23 -> System.out.println("You are going to join a job!");
            case 60 -> System.out.println("You are going to get retired");
            default -> System.out.println("Enjoy your life");
        }
    }
}
