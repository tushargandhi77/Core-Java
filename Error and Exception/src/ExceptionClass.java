import java.sql.Struct;
import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am toString()";
    }

    public String getMassage(){
        return "I am getMassage";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
