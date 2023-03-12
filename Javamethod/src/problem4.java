public class problem4 {
    static void pattern(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
