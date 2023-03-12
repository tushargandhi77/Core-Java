import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) throws IOException {
//        File myfile = new File("Tushar.txt");
//        try {
//            myfile.createNewFile();
//        }
//        catch (Exception e){
//            System.out.println("unable to create file");
//            System.out.println(e);
//        }
//        FileWriter fileWriter = new FileWriter("Tushar.txt");
//        fileWriter.write("This is our first file form this couse");
//        fileWriter.close();
//
//        File myFile = new File("Tushar");
//        try{
//            Scanner sc = new Scanner(myFile);
//            while(sc.hasNextLine()){
//                String line = sc.nextLine();
//            System.out.println(line);
//            }
//        sc.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
        File myfile = new File("Tushar.txt");
        if(myfile.delete()){
            System.out.println("I have deleted: "+myfile.getName());
        }
        else{
            System.out.println("some problem occured while deleting the file");
        }
    }
}
