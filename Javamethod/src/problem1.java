public class problem1 {
    static void mul(int n){
        int i;
        for(i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        mul(4);
    }
}
