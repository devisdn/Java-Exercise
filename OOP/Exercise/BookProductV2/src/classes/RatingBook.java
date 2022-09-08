package classes;
import childs.Reviewer;
import parents.Book;
public class RatingBook {
    // attributes
    private Book book;
    private Reviewer reviewer;
    private Double ratingScore;
    
    // constructor
    public RatingBook() {
        super();
    }

    public RatingBook(Book book, Reviewer reviewer, Double ratingScore) {
        super();
        this.book = book;
        this.reviewer = reviewer;
        this.ratingScore = ratingScore;
    }

    // method
    @Override
    public String toString() {
        return  book.toString() +
                reviewer.toString() +
                "\nRating Score\t: " + ratingScore;
    }

    // getter & setter
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
    }

    public Double getRatingScore() {
        return ratingScore;
    }

    public void setRatingScore(Double ratingScore) {
        this.ratingScore = ratingScore;
    }

    
}
