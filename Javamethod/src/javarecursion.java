public class javarecursion {
    static int factorial(int n){
        int fact;
       if(n==1 || n==0){
           return 1;
       }
       fact = n*factorial(n-1);
       return fact;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }
}
