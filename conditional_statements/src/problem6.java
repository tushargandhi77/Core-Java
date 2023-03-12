import  java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organization website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a commerce website");
        }
        else{
            System.out.println("This is a indian website");
        }
    }
}
