import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        System.out.println("Enter your income");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax;
        if(income <= 2.5f){
            tax = 0;
        }
        else if(income <= 5f){
            tax = (income-2.5f)*0.05f;
        }
        else if(income <= 10f){
            tax = (income-5f)*0.10f + 2.5f*0.05f;
        }
        else{
            tax = (income-10f)*0.3f + 5f*0.1f + 2.5f*0.05f;
        }
        System.out.println("The tax is "+tax);
    }
}
