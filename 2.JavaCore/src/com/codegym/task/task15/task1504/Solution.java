package com.codegym.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
OOP: Books
1. Create a public static class MarkTwainBook that inherits Book. Name of the author [Mark Twain].
The constructor parameter is the book title.
2. Implement all the abstract methods in the MarkTwainBook class.
3. Change the return type of the getBook method to make it more appropriate.
4. In a similar manner, create the AgathaChristieBook class. Name of the author [Agatha Christie].
5. In the Book class, implement the getOutputByBookType method so that it returns:
5.1. agathaChristieOutput for books written by Agatha Christie;
5.2. markTwainOutput for books written by Mark Twain.


Requirements:
1. The Solution class must contain the public static MarkTwainBook class.
2. The MarkTwainBook class must be a descendant of the Book class.
3. The MarkTwainBook class must correctly implement a constructor with one String parameter (book title).
4. The MarkTwainBook class constructor should call the constructor of the parent class (Book) with the argument "Mark Twain".
5. The getBook method in the MarkTwainBook class must have the MarkTwainBook return type and return the current object.
6. The Solution class must contain the public static AgathaChristieBook class.
7. The AgathaChristieBook class must be a descendant of the Book class.
8. The AgathaChristieBook class must correctly implement a constructor with one String parameter (book title).
9. The AgathaChristieBook class constructor should call the constructor of the parent class (Book) with the argument "Agatha Christie".
10. The getBook method in the AgathaChristieBook class must have the AgathaChristieBook return type and return the current object.
11. The getTitle method in the AgathaChristieBook and MarkTwainBook classes should return the title of a specific book.
12. The getOutputByBookType method must return the correct string for AgathaChristieBook objects.
13. The getOutputByBookType method must return the correct string for MarkTwainBook objects.
14. The MarkTwainBook class must have a String field title (book title).
15. The AgathaChristieBook class must have a String field title (book title).
*/

public class Solution {

    public static class MarkTwainBook extends Book{

        String title;
        public MarkTwainBook(String bookTitle) {

            super("Mark Twain");
            this.title = bookTitle;
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }

    public static class AgathaChristieBook extends Book{

        String title;

        public AgathaChristieBook(String bookTitle) {

            super("Agatha Christie");
            this.title = bookTitle;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }

    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            //write your code here

            if(this instanceof AgathaChristieBook){
                output = agathaChristieOutput;
            } else{
                output = markTwainOutput;
            }

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}
