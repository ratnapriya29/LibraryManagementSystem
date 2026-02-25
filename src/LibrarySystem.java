package src;
import java.util.Scanner;

public class LibrarySystem {

    static Library lib = new Library();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        seed();

        int ch;
        do {
            menu();
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> addBook();
                case 2 -> addMember();
                case 3 -> lib.showBooks();
                case 4 -> borrow();
                case 5 -> giveBack();
                case 6 -> System.out.println("Exit");
                default -> System.out.println("Invalid");
            }
        } while (ch != 6);
    }

    static void menu() {
        System.out.println("\n=== LIBRARY ===");
        System.out.println("1 Add Book");
        System.out.println("2 Add Member");
        System.out.println("3 Show Books");
        System.out.println("4 Borrow");
        System.out.println("5 Return");
        System.out.println("6 Exit");
        System.out.print("Choice: ");
    }

    static void addBook() {
        System.out.print("ISBN: ");
        String i = sc.nextLine();
        System.out.print("Title: ");
        String t = sc.nextLine();
        System.out.print("Author: ");
        String a = sc.nextLine();
        System.out.print("Genre: ");
        String g = sc.nextLine();

        lib.addBook(new Book(i, t, a, g));
    }

    static void addMember() {
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Name: ");
        String n = sc.nextLine();
        System.out.print("Contact: ");
        String c = sc.nextLine();

        lib.addMember(new Member(id, n, c));
    }

    static void borrow() {
        System.out.print("Member ID: ");
        String mid = sc.nextLine();
        System.out.print("Book ISBN: ");
        String isbn = sc.nextLine();

        Member m = lib.findMember(mid);
        Book b = lib.findBook(isbn);

        if (m == null || b == null) {
            System.out.println("Invalid.");
            return;
        }

        if (m.borrow(b))
            System.out.println("Borrowed.");
        else
            System.out.println("Not available.");
    }

    static void giveBack() {
        System.out.print("Member ID: ");
        String mid = sc.nextLine();
        System.out.print("Book ISBN: ");
        String isbn = sc.nextLine();

        Member m = lib.findMember(mid);
        Book b = lib.findBook(isbn);

        if (m == null || b == null) {
            System.out.println("Invalid.");
            return;
        }

        if (m.giveBack(b))
            System.out.println("Returned.");
        else
            System.out.println("Not borrowed.");
    }

    static void seed() {
        lib.addBook(new Book("101", "Java", "James", "Programming"));
        lib.addMember(new Member("M1", "Alice", "999"));
    }
}