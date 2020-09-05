package mirea.ru.lab1;

public class Book {

    private Boolean bookIsClosed;
    private String bookName;

    public Book(String name,Boolean isBookClosed){
        this.bookIsClosed = isBookClosed;
        this.bookName = name;
    }

    public void OpenTheBook(){
        if (bookIsClosed) { System.out.println("You have opened the book"); bookIsClosed = false;} else System.out.println("You tried to open the book but is already open");
    }
    public void CloseTheBook(){
        if (!bookIsClosed)  { System.out.println("You have closed the book"); bookIsClosed = true;} else System.out.println("You tried to close the book but is already closed");
    }
    public void GetBookName(){
        System.out.println("The book name is " + bookName);
    }
}
