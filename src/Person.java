import java.time.LocalDate;
import java.util.ArrayList;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private ArrayList<Book> books = new ArrayList<>();
    
    // private int age; // 0   
    // private Integer height; //null



    public Person(String name, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public Person() {
    }

    public void addBookToCollection(Book book) { // book = GOT
        this.books.add(book);

      
    }

    // public Person(String name, String email) {
    // System.out.println("Ran Person constructor with some params");
    // this.name = name;
    // this.email = email;
    // }

    // public Person() {
    // System.out.println("Ran Person constructor without params");
    // }

    // public Person(int x, int y) {
    // System.out.println(x + y + "Private method");
    // }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public String getEmail() {

        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String toString() {
        return "Name: " + this.name + " Email: " + this.email + " Date of birth: " + this.dateOfBirth + " Books: " + this.books;
    }
}
