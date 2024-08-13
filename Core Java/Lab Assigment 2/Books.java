package Assigment;

class Book {
    String title;
    String author;
    String isbn;
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}
class Library {
    private Book[] books;
    private int count;
    Library(int size) {
        books = new Book[size];
        count = 0;
    }
    void addBook(String title, String author, String isbn) {
        if (count < books.length) {
            books[count] = new Book(title, author, isbn);
            count++;
            System.out.println("Book added: " + title);
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }
    void removeBook(String isbn) {
        for (int i = 0; i < count; i++) {
            if (books[i].isbn.equals(isbn)) {
                System.out.println("Book removed: " + books[i].title);
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Book not found.");
    }
    void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < count; i++) {
                books[i].displayBookDetails();
            }
        }
    }
}

public class Books {

	public static void main(String[] args) {
		Library library = new Library(5);
        library.addBook("To Kill a Mockingbird", "Harper Lee", "9780060935467");
        library.addBook("1984", "George Orwell", "9780451524935");
        System.out.println("Books in the library:");
        library.displayBooks();
        library.removeBook("9780451524935");
        System.out.println("Books in the library after removal:");
        library.displayBooks();
	}

}
