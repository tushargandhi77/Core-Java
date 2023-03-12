class area{
    public int side;
    public int getSide(){
        return side;
    }
}
public class practiice {
    public static void main(String[] args) {
        area a = new area();
        a.side = 32;
        System.out.println(a.getSide());
    }
}
