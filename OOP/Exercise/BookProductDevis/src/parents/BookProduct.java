package parents;
import childs.person.Author;
import publisher.Publisher;

public class BookProduct {
    // attributes
    private String bookCode, bookTitle;
    private double price;
    private Author author;
    private Publisher publisher;
    
    // constructor
    public BookProduct(){ 
        super();
    }

    public BookProduct(String bookCode, String bookTitle, Author author, Publisher publisher) {
        super();
        this.bookCode = bookCode;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
    }
    
    // method
    public String toString(){
        return  "\nBook Code\t: " + bookCode +
                "\nBook Title\t: " + bookTitle +
                "\nAuthor\t: " + author.getFullName() +
                "\nCountry\t: " + author.getCountry() +
                "\nPublisher\t: " + publisher.getName() +
                "\nLocation\t: " + publisher.getCountry() +
                "\nPrice Book\t: " + price;
    }

    // getter
    public String getBookCode(){
        return this.bookCode;
    }

    public String getBookTitle(){
        return this.bookTitle;
    }

    public Person getAuthor(){
        return author;
    }

    public Publisher getPublisher(){
        return publisher;
    }

    public double getPrice(){
        return price;
    }

    // setter
    public void setBookCode(String bookCode){
        this.bookCode = bookCode;
    }

    public void setTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public void setPublisher(Publisher publisher){
        this.publisher = publisher;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
