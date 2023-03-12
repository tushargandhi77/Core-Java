import java.io.FileWriter;

public class problem4 {
    public static void main(String[] args) {
        int i=5;
        String table = "";
        for(int j=0;j<10;j++){
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try{
            FileWriter fileWriter = new FileWriter("Multiplication table");
            fileWriter.write(table);
            fileWriter.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
