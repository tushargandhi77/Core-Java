public class problem2 {
    public static void main(String[] args) {
        try{
            int a = 666/9;
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch (ArithmeticException e){
            System.out.println("HaHa");
        }
    }
}
