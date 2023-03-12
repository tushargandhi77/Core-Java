
class Employee {
    int id;
    String name;
    public void printdetails(){
        System.out.println("My id is "+id);
        System.out.println("and My name is "+name);
    }
}

public class Main {
    public static void main(String[] args) {
    System.out.println("This is our custom class");
    Employee harry = new Employee();
    // Setting Attirbutes
    harry.id = 12;
    harry.name = "Tushar";
    harry.printdetails();
    // System.out.println(harry.id);
    // System.out.println(harry.name);

    }
}