interface myInt{
    void display();
}
public class problem3 {
    public static void main(String[] args) {
        myInt i = new myInt() {
            @Override
            public void display() {
                System.out.println("I am display");
            }
        };
    }
}
