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

    public Comic(String title, String releaseDate, Mangaka mangaka, Publisher publisher, Boolean isVolumeSeries) {
        super(title, releaseDate, mangaka, publisher);
        this.isVolumeSeries = isVolumeSeries;
    }

    // method
    @Override
    public String toString(){
        return super.toString() + 
                "\nVolume Series\t: " + isVolumeSeries;
    }
    
    // getter & setter
    public Boolean getVolumeSeries() {
        return isVolumeSeries;
    }

    public void setVolumeSeries(Boolean isVolumeSeries) {
        this.isVolumeSeries = isVolumeSeries;
    }
}