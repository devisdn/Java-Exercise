import parents.*;
import classes.*;
import data.DataBook;
import repositories.*;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        int choice; //char retry;
        Scanner input = new Scanner(System.in);
        Map<String, Object> allData = BookRepositori.getAllBookAndRating();
       
        //List<RatingBook> listRatingBook = (List<RatingBook>) allData.get("listRatingBook");
        List<Book> listBook = (List<Book>) allData.get("listBook");
        List<Publisher> listPublisher = (List<Publisher>) allData.get("listPublisher");
        
        System.out.println("\nMasukkan pilihan Anda : ");
        choice = input.nextInt();

        switch (choice){
          case 1:
            DataBook.getAllCheapestBookPrice(listBook);
            break;
          case 2:
            DataBook.getAllMaxBookPrice(listBook);
            break;
          case 3:
            DataBook.getAllMangaka(listBook);
            break;
          case 4:
            break;
          case 5:
            break;
          case 6:
            break;
          case 7:
            break;
          case 8:
            break;
          case 9:
            break;
          case 10:
            DataBook.getAllPublisherWithExpensivePaper(listPublisher);
            break;
          case 11:
            DataBook.getAllComicWithMangakaBestSeller(listBook);
            break;
          case 12:
            break;
          case 13:
            break;
          case 14:
            break;
          case 15:
            break;
          case 16:
            break;
          case 17:
            break;
          case 18:
            break;
          case 19:
            break;
          case 20:
            break;
        }
    }
}