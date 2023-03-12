public class problem2 {
    static void patternl(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternl(4);
    }
}
