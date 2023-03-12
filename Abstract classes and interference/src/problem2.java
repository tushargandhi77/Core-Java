class monkey{
    void jump(){
        System.out.println("Jump.....");
    }
    void bite(){
        System.out.println("Bite....");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicAnimal{
    void speek(){
        System.out.println("Hello sir!!");
    }
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}
public class problem2 {
    public static void main(String[] args) {
        // inheritance
        human h1 = new human();
        h1.sleep();
        h1.speek();
        // polymorphism
        basicAnimal h2 = new human();
        h2.eat();
    }
}
