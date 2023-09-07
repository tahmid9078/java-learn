import java.time.LocalDate;

public class App {
  public static void main(String[] args) {
    Person tahmid = new Person(
      "Tahmid", 
      LocalDate.of(1995, 10, 9),
       "tahmid@abc.com"
    );

    Person jasarat = new Person();

    jasarat.setName("Jasarat");
    jasarat.setDateOfBirth(LocalDate.of(1998, 3, 19));
    jasarat.setEmail("jasarat@abc.com");

    Book alchemist = new Book("The Alchemist", "Paulo Coelho");
    Book harryPotter = new Book("Harry Potter", "J. K. Rowling");
    Book gameOfThrones = new Book("Game of Thrones", "George R. R. Martin");


    
    // jasarat.getBook();
    jasarat.addBookToCollection(harryPotter);
    jasarat.addBookToCollection(gameOfThrones);
    
    
    tahmid.addBookToCollection(harryPotter);
    tahmid.addBookToCollection(alchemist);
    
    // jasarat.setBook(alchemist);
    // tahmid.setBook(gameOfThrones);
    
    System.out.println(jasarat.toString());
    System.out.println(tahmid.toString());
   
    
    // INHERITANCE

    HardCopyBook abc = new HardCopyBook("abc", "xyz", 20);   
    HardCopyBook thePatient = new HardCopyBook();

    thePatient.setAuthor("xyz");
    thePatient.setTitle("The Patient");
    thePatient.setPageNo(30);


    AudioBook snowWhite = new AudioBook("SnowWhite", "oop", 60);   
    AudioBook aliceInWonderLand = new AudioBook();

    aliceInWonderLand.setAuthor("nic");
    aliceInWonderLand.setTitle(" AliceInWonderLand");
    aliceInWonderLand.setRunTime(80);
    
    System.out.println(snowWhite.toString());
    System.out.println(aliceInWonderLand.toString());

  }
}

// OOP fundamentals
// 1. Encapsulation
// 2. Inheritance
// 3. Polymorphism
// 4. Abstraction

// method overriding & overloading
