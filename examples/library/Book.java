package core.examples.library;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    String isbn;

    public void getDetailsOfBook () {
        System.out.println("Title of book: " + this.title);
        System.out.println("Author of book: " + this.author);
        System.out.println("ISBN of book: " + this.isbn);
    }

    public void setBookDetails() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter title of book:");
        this.title = scn.nextLine();
        System.out.print("Enter Author of book:");
        this.author = scn.nextLine();
        System.out.print("Enter ISBN of book:");
        this.isbn = scn.nextLine();
        scn.close();
    }
}
