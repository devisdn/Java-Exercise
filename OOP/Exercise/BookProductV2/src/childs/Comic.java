package childs;

import classes.Publisher;
import parents.Book;

public class Comic extends Book {
    // attributes
    private Boolean isVolumeSeries;

    // constructor
    public Comic() {
        super();
    }

    public Comic(String title, String releaseDate, Author author, Publisher publisher, double price,
            Boolean isVolumeSeries) {
        super(title, releaseDate, author, publisher, price);
        this.isVolumeSeries = isVolumeSeries;
    }

    // getter & setter
    public Boolean getVolumeSeries() {
        return isVolumeSeries;
    }

    public void setVolumeSeries(Boolean isVolumeSeries) {
        this.isVolumeSeries = isVolumeSeries;
    }
}