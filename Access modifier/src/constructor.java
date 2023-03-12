class employee{
    private int id;
    private String name;

    public employee(int n,String s){
        id = n;
        name = s;
    }
    public employee(){
        id = 45;
        name = "Your name";
    }
    public int getid(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class constructor{
    public static void main(String[] args) {
        employee tushar = new employee(12,"Tushar");
        System.out.println(tushar.getid());
        System.out.println(tushar.getName());
    }
}
