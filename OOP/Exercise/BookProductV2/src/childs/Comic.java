package childs;

import parents.Book;

public class Comic extends Book {
    // attributes
    private Boolean isVolumeSeries;

    // constructor
    public Comic() {
        super();
    }

    public Comic(Boolean isVolumeSeries) {
        this.isVolumeSeries = isVolumeSeries;
    }


}
