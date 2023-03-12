class myemployee{
    private int id;
    private String name;
    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
    public void setid(int i){
        id = i;
    }
    public int getid(){
        return id;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        myemployee tushar = new myemployee();
        tushar.setid(43);
        tushar.setname("pagal bewada");
        System.out.println(tushar.getid());
        System.out.println(tushar.getname());
    }
}