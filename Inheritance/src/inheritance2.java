class Base1{
    Base1(){
        System.out.println("I am a base classs constructor");
    }
    Base1(int a){
        System.out.println("I am overloader constructor");
    }
}
class derive1 extends Base1{
    derive1(){
        System.out.println("I am a derived class construtor");
    }
    derive1(int x,int y){
        super(x);
        System.out.println("I am a overloaded derive1 class constructor");
    }
}

class childderive extends derive1{
    childderive() {
        System.out.println("I am a child derived constructor");
    }
    childderive(int x,int y,int z){
        super(x,y);
            System.out.println("I am overloader contructor of childderive constructor");
        }
    }
public class inheritance2 {
    public static void main(String[] args) {
        derive1 d = new childderive(2,4,2);
    }
}
