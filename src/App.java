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

    // System.out.println(tahmid.getName() + " age: " + tahmid.getAge());
    // System.out.println(jasarat.getName() + " age: " + jasarat.getAge());

    Book alchemist = new Book("The Alchemist", "Paulo Coelho");
    Book harryPotter = new Book("Harry Potter", "J. K. Rowling");
    Book gameOfThrones = new Book("Game of Thrones", "George R. R. Martin");
    
    jasarat.setBook(alchemist);
    tahmid.setBook(gameOfThrones);

    System.out.println(jasarat.toString());    
    System.out.println(tahmid.toString());

  }
}

// OOP fundamentals
// 1. Encapsulation
// 2. Inheritance
// 3. Polymorphism
// 4. Abstraction

// method overriding & overloading
