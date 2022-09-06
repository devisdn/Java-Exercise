package childs.book;

import childs.person.Author;
import parents.BookProduct;
import publisher.Publisher;

public class Book extends BookProduct{
    // constructor
    public Book(){
        super();
    }

    public Book(String bookCode, String bookTitle, Author author, Publisher publisher){
        super(bookCode, bookTitle, author, publisher);
        calculatePrice();
    }

    // method
    public String toString(){
        return super.toString();
    }

    public void calculatePrice(){
        double total = 1.20 * getPublisher().getProductioncost();
        super.setPrice(total);
    }

}
