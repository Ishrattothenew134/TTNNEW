package custom2;
import java.util.jar.Attributes.Name;

/* Create Java classes having suitable attributes for Library management system.
Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
*/
abstract class Library {
    int libraryId = 5837312;
    abstract void libraryDetails();
}
interface Book {
    int bookId = 1234335;
    void bookDetails();
}

// inheritance
class Authors extends Library implements Book{
    // Abstraction
    private int authorId;
    private String authorName;


    // overriding (Polymorphism)
    public void setAuthorsDetails(int id, String name) {
        authorId = id;
        authorName = name;
    }

    public void setAuthorsDetails(String name, int id) {
        authorId = id;
        authorName = name;
    }

    // abstract class and overriding (Polymorphism)
    @Override
    void libraryDetails() {
        System.out.println("Library id: " +libraryId);
    }

    // interface and overriding
    @Override
    public void bookDetails() {
        System.out.println("Book id: " +bookId);
    }

    void authorDetails() {
        System.out.println("Author id: " +authorId);
        System.out.println("Author name: " +authorName);
    }
}

public class q1 {
    public static void main(String [] args) {
        // Encapsulation
        Authors author = new Authors();
        author.setAuthorsDetails(654, "Nicholas Sparks");
        author.setAuthorsDetails("Honey Singh", 232);
        author.authorDetails();
        Library library = new Authors();
        library.libraryDetails();
        Book book = new Authors();
        book.bookDetails();
    }
}
