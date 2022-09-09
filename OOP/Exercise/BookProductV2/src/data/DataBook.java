package data;
import java.util.*;
import childs.*;
import parents.*;
import classes.*;

public class DataBook {

    //1. Cheapest Books
    public static double getCheapestBookPrice(List<Book> listBooks){
        List<Double> priceBooks = new ArrayList<Double>();
        for (Book book : listBooks) { 
          priceBooks.add(book.getPrice());
        }
        return Collections.min(priceBooks);
    }
    
    public static void getAllCheapestBookPrice(List<Book> listBook){
        for (Book book : listBook) {
            if (book.getPrice() == getCheapestBookPrice(listBook)) {
            System.out.println(book);
            }
        }
    }

    //2. Expensive Book Prices
    public static double getMaxBookPrice(List<Book> listBook){
        List<Double> priceBooks = new ArrayList<Double>();
        for (Book book : listBook) { 
          priceBooks.add(book.getPrice());
        }
        return Collections.max(priceBooks);
    }
    
    public static void getAllMaxBookPrice(List<Book> listBook){
        for (Book book : listBook) {
          if (book.getPrice() == getMaxBookPrice(listBook)) {
            System.out.println(book);
          }
        }
    }

    //3. All Mangaka
    public static void getAllMangaka(List<Book> listBook){
        for (Book book : listBook) {
           if (book.getAuthor() instanceof Mangaka) {
             System.out.println(book.getAuthor());
            }
        } 
    }

    //4. All Mangaka with gender male
    public static void getAllMaleMangaka(List<Book> listBook){
        for (Book book : listBook) {
            if  (book.getAuthor() instanceof Mangaka){
                if (book.getAuthor().getGender().equalsIgnoreCase("Male")){
                System.out.println(book.getAuthor());
                }
            }
        }
    }

    //5. All Author
    public static void getAllAuthor(List<Book> listBook){
        for (Book book : listBook) {
            System.out.println(book.getAuthor());
        }
    }
    
    //6. All Author with gender female
    public static void getAllFemaleAuthor(List<Book> listBook){
        for (Book book : listBook) {
          if (book.getAuthor().getGender().equalsIgnoreCase("Female")){
                System.out.println(book.getAuthor());
          } 
        }
    }

    //7. All Author with age under 25
    public static void getAllAuthorWithAgeUnder25(List<Book> listBook){
        for (Book book : listBook){
          if (book.getAuthor().getAge() < 25){
            System.out.println(book.getAuthor());
          }
        }
    }

    //8. All Author from Indonesia
    public static void getAllAuthorFromIna(List<Book> listBook){
        for (Book book : listBook){
          if (book.getAuthor().getCountry().equalsIgnoreCase("Indonesia")){
            System.out.println(book.getAuthor());
          }
        }
    }
    
    //9. All Publisher with expensive paper
    public static double getExpensivePaperPrice(List<Publisher> listPublisher){
        List<Double> pricePaper = new ArrayList<Double>();
        for (Publisher publisher : listPublisher) { 
          pricePaper.add(publisher.getPaper().getPaperPrice());
        }
        return Collections.max(pricePaper);
    }
    public static void getAllPublisherWithExpensivePaper(List<Publisher> listPublisher){
      for (Publisher publisher : listPublisher) {
        if (publisher.getPaper().getPaperPrice() == getExpensivePaperPrice(listPublisher)) {
          System.out.println(publisher);
        }
      }
    }

    //10. All Publisher with cheapest paper
    public static double getCheapestPaperPrice(List<Publisher> listPublisher){
        List<Double> pricePaper = new ArrayList<Double>();
        for (Publisher publisher : listPublisher) { 
          pricePaper.add(publisher.getPaper().getPaperPrice());
        }
        return Collections.min(pricePaper);
    }
    public static void getAllPublisherWithCheapestPaper(List<Publisher> listPublisher){
      for (Publisher publisher : listPublisher) {
        if (publisher.getPaper().getPaperPrice() == getCheapestPaperPrice(listPublisher)) {
          System.out.println(publisher);
        }
      }
    }

    //11. Comic with mangaka rating best seller
    public static void getAllComicWithMangakaBestSeller(List<Book> listBook){
        for (Book book : listBook) {
            if (book instanceof Comic) {
              if (book.getAuthor() instanceof Mangaka
                  && (((Mangaka) book.getAuthor()).getRating().equalsIgnoreCase("best seller"))) {
                System.out.println(book);
              }
            }
        }
    }

    //12. Comic with volumeSeries
    public static void getAllComicVolumeSeries(List<Book> listBook){
        for (Book book : listBook) {
            if (book instanceof Comic) {
              if (((Comic)book).getVolumeSeries()) {
                System.out.println(book);
              }
            }
        }
    }

    //13. Comic with expensive price
    public static double getExpensiveComicPrice(List<Book> lisBook){
        List<Double> priceComic = new ArrayList<Double>();
        for (Book book : lisBook) {
            if(book instanceof Comic){
                priceComic.add(book.getPrice());
            }
        }
        return Collections.min(priceComic);
    }

    public static void getAllExpensiveComic(List<Book> listBook){
        for (Book book : listBook) {
          if (book instanceof Comic) {
            if (((Comic)book).getPrice() == getExpensiveComicPrice(listBook)) {
              System.out.println(book);
            }
          }
        }
    }
}