package parents;
import childs.Author;
import classes.*;

public class Book {
    // attributes
    private String title, releaseDate;
    private Author author;
    private Publisher publisher;
    private double price;
    
    // constructor
    public Book() {
        super();
    }

    public Book(String title, String releaseDate, Author author, Publisher publisher, double price) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    // method
    public void calculatePrice(){
        setPrice(1.5 * publisher.getPaper().getPaperPrice());
    }

    // getter & setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}