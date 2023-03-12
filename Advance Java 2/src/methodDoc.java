public class methodDoc {
    /**
     *
     * @param args These are arguments to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * Hello this is method
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return sum of two number as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int i,int j) throws Exception{
        int c;
        if(i==0){
            throw new Exception();
        }
        c=i+j;
        return c;
    }
}
