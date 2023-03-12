public class problem3 {
    static int sumrec(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sumrec(n-1);
        }
    }
    public static void main(String[] args) {
        int c = sumrec(4);
        System.out.println(c);
    }
}
