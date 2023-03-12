import java.util.ArrayList;

class Book{
    public String name,author,issuedTo,issueOn;
}
class Library{
    public ArrayList<Book> books;
    public Library(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book){
        System.out.println("The book has been issued to the library");
        this.books.remove(book);
    }
    public void returnBook(Book book){
        System.out.println("The book has been return ");
        this.books.add(book);
    }
}
public class Exercise7 {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
    }
}
