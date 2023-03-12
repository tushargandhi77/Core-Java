
class Employee1{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
}
public class problem1 {
    public static void main(String[] args) {
        Employee1 harry = new Employee1();
        harry.setname("Tushar");
        harry.salary = 32;
        System.out.println(harry.getsalary());
        System.out.println(harry.getname());
    }
}
