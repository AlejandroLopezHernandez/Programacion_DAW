package OOP_Ejercices.Ejercice5;
/* 5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN,
 and methods to add and remove books from a collection. */
 import java.util.*;
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Book> books = new ArrayList<Book>();


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        
    }
    public static void addbooks (Book s){
    books.add(s);
    }
    public static void removebooks(Book s){
        books.remove(s);
    }
    public static ArrayList <Book> get_Books(){
        return books;
    }
    public static void main(String[] args) {
        
        Book book1 = new Book("The Brothers Karamazov", "Fiodor Dostoyevski", "32434233434");
        Book book2 = new Book("Don Quixote", "Miguel de Cervantes", "56656776");
        Book book3 = new Book("War and Peace", "Lev Tolstoi", "89865434");
        Book.addbooks(book2);
        Book.addbooks(book1);
        Book.addbooks(book3);
        ArrayList<Book> books = Book.get_Books();

        System.out.println(" The list of books is: ");
        for(Book s : books){
            System.out.println(s.getTitle()+ " by " + s.getAuthor() +
            " with the ISBN " + s.getISBN());
        }

    }
}
