public class problem5 {
    static int fib(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        int res = fib(5);
        System.out.println(res);
    }
}
