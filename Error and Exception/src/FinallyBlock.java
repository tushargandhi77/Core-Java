public class FinallyBlock {
    public static int greet(){
        try{
            int a=5;
            int b=0;
            int c = a/b;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of this block");
        }
        return 0;
    }
    public static void main(String[] args) {
        greet();
    }
}
