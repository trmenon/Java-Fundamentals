package core.examples.library;

public class Library {
    Book booklist;

    public void getBooks() {
        booklist.getDetailsOfBook();
    }
    public void setBook() {
        Book newBook = new Book();
        newBook.setBookDetails();
        this.booklist = newBook;
    }
}
