class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius Cannot negative!";
    }
    public String getMassage(){
        return "Radius Cannot negative!";
    }
}

public class ThrowAndThrows {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return  result;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // Shivam - uses divide function created by harry;
        try {
            int c = divide(6, 0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        try{
            double ar = area(9);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
