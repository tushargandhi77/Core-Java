import  java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Tushar");
        System.out.println(letter);
    }
}
