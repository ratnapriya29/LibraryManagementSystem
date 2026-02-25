package src;
import java.util.ArrayList;

public class Member {
    private String id;
    private String name;
    private String contact;
    private ArrayList<Book> borrowed;

    public Member(String id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.borrowed = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getName() { return name; }

    public boolean borrow(Book b) {
        if (b != null && b.isAvailable()) {
            borrowed.add(b);
            b.setAvailable(false);
            return true;
        }
        return false;
    }

    public boolean giveBack(Book b) {
        if (borrowed.contains(b)) {
            borrowed.remove(b);
            b.setAvailable(true);
            return true;
        }
        return false;
    }
}