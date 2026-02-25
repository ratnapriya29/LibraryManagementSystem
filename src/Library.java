package src;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void addMember(Member m) {
        members.add(m);
    }

    public Book findBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn))
                return b;
        }
        return null;
    }

    public Member findMember(String id) {
        for (Member m : members) {
            if (m.getId().equals(id))
                return m;
        }
        return null;
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books.");
            return;
        }
        for (Book b : books)
            b.display();
    }

    public void showAvailable() {
        for (Book b : books)
            if (b.isAvailable())
                b.display();
    }
}