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

    public Book(String title, String releaseDate, Author author, Publisher publisher) {
        super();
        this.title = title;
        this.releaseDate = releaseDate;
        this.author = author;
        this.publisher = publisher;
        calculatePrice();
    }

    // method
    public void calculatePrice(){
        setPrice(1.5 * publisher.getPaper().getPaperPrice());
    }

    @Override
    public String toString() {
        return  "\n==========================================================\n" +
                "\nBook Title\t: " + title +
                "\nBook Author\t: " + author.getFirstName() + " " + author.getLastName() +
                "\nCountry\t\t: " + author.getCountry() +
                "\nRelease Date\t: " + releaseDate +
                "\nPublisher\t: " + publisher.getCompanyName() +
                "\nPrice Book\t: " + price;
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