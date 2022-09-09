package classes;
public class Paper{
    // attributes
    private String qualityPaper;
    private Double paperPrice;

    // constructor
    public Paper(){
        super();
    }

    public Paper(String qualityPaper, Double paperPrice) {
        super();
        this.qualityPaper = qualityPaper;
        this.paperPrice = paperPrice;
    }

    // method
    @Override
    public String toString() {
        return  "\nPaper Quality\t: " + qualityPaper + 
                "\nPaper Price\t: " + paperPrice;
    }

    // getter & setter
    public String getQualityPaper() {
        return qualityPaper;
    }

    public void setQualityPaper(String qualityPaper) {
        this.qualityPaper = qualityPaper;
    }

    public Double getPaperPrice() {
        return paperPrice;
    }

    public void setPaperPrice(Double paperPrice) {
        this.paperPrice = paperPrice;
    }


}