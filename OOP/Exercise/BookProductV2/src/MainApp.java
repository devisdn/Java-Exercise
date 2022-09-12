import parents.*;
import classes.*;
import data.*;
import repositories.*;
import java.util.*;

import childs.Reviewer;

public class MainApp {
    public static void main(String[] args) {
        int choice; //char retry;
        Scanner input = new Scanner(System.in);
        Map<String, Object> allData = BookRepositori.getAllBookAndRating();
       
        //List<RatingBook> listRatingBook = (List<RatingBook>) allData.get("listRatingBook");
        List<Book> listBook = (List<Book>) allData.get("listBook");
        List<Publisher> listPublisher = (List<Publisher>) allData.get("listPublisher");
        List<Paper> listPaper = (List<Paper>) allData.get("listPaper");
        List<Reviewer> listReviewer = (List<Reviewer>) allData.get("listReviewer");
        List<RatingBook> listRatingBook = (List<RatingBook>) allData.get("listRatingBook");
        
        System.out.print("\nMasukkan pilihan Anda : ");
        choice = input.nextInt();

        switch (choice){
          case 1:
            System.out.println("Data Buku Termurah");
            DataBook.getAllCheapestBookPrice(listBook);
            break;
          case 2:
            DataBook.getAllMaxBookPrice(listBook);
            break;
          case 3:
            DataBook.getAllMangaka(listBook);
            break;
          case 4:
            DataBook.getAllMaleMangaka(listBook);
            break;
          case 5:
            DataBook.getAllAuthor(listBook);
            break;
          case 6:
            DataBook.getAllFemaleAuthor(listBook);
            break;
          case 7:
            DataBook.getAllAuthorWithAgeUnder25(listBook);
            break;
          case 8:
            DataBook.getAllAuthorFromIna(listBook);
            break;
          case 9:
            DataBook.getAllPublisherWithExpensivePaper(listPublisher);
            break;
          case 10:
            DataBook.getAllPublisherWithCheapestPaper(listPublisher);
            break;
          case 11:
            DataBook.getAllComicWithMangakaBestSeller(listBook);
            break;
          case 12:
            DataBook.getAllComicVolumeSeries(listBook);
            break;
          case 13:
            DataBook.getAllExpensiveComic(listBook);
            break;
          case 14:
            DataBook.getPublisherFromJapan(listBook);
            break;
          case 15:
            DataBook.getBookGenreFantasy(listBook);
            break;
          case 16:
            DataBook.getAllPaper(listPaper);
            break;
          case 17:
            DataBook.getAllPublisherWithExpensivePaper(listPublisher);
            break;
          case 18:
            DataRatingBook.getAllReviewer(listReviewer);
            break;
          case 19:
            DataRatingBook.getAllVerifiedReviewer(listReviewer);
            break;
          case 20:
            DataRatingBook.getAllLowRatingScoreBook(listRatingBook);
            break;
          case 21:
            DataRatingBook.getBookWithRatingUpperThanMean(listRatingBook);
            break;
          case 22:
            DataRatingBook.getAllHighRatingScoreComic(listRatingBook);
        }
    }
}