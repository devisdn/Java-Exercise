import parents.*;
import classes.*;
import data.*;
import repositories.*;
import java.util.*;

import childs.Reviewer;

public class MainApp {
    public static void main(String[] args) {
        int choice; char retry;
        try (Scanner input = new Scanner(System.in)) {
          Map<String, Object> allData = BookRepositori.getAllBookAndRating();
    
          //List<RatingBook> listRatingBook = (List<RatingBook>) allData.get("listRatingBook");
          @SuppressWarnings("unchecked")
          List<Book> listBook = (List<Book>) allData.get("listBook");
          @SuppressWarnings("unchecked")
          List<Publisher> listPublisher = (List<Publisher>) allData.get("listPublisher");
          @SuppressWarnings("unchecked")
          List<Paper> listPaper = (List<Paper>) allData.get("listPaper");
          @SuppressWarnings("unchecked")
          List<Reviewer> listReviewer = (List<Reviewer>) allData.get("listReviewer");
          @SuppressWarnings("unchecked")
          List<RatingBook> listRatingBook = (List<RatingBook>) allData.get("listRatingBook");
          
          do{
            System.out.println("##  Daftar Menu BookProduct Devis v2 ##");
            System.out.println("=======================================");
            System.out.println("1. Data Buku Termurah");
            System.out.println("2. Data Buku Termahal");
            System.out.println("3. Data Semua Mangaka");
            System.out.println("4. Data Mangaka Laki-Laki");
            System.out.println("5. Data Semua Author");
            System.out.println("6. Data Author Perempuan");
            System.out.println("7. Data Author Berumur Dibawah 25th");
            System.out.println("8. Data Author Dari Indonesia");
            System.out.println("9. Data Publisher Dengan Kertas Termahal");
            System.out.println("10. Data Publisher Dengan Kertas Termurah");
            System.out.println("11. Data Comic Dengan Rating Mangaka Best Seller");
            System.out.println("12. Data Comic Volume Series");
            System.out.println("13. Data Comic Termahal");
            System.out.println("14. Data Buku Dengan Publisher Dari Jepang");
            System.out.println("15. Data Buku Dengan Genre Fantasy");
            System.out.println("16. Data Semua Jenis Kertas");
            System.out.println("17. Data Publisher Dengan Kertas Termahal");
            System.out.println("18. Data Semua Reviewer");
            System.out.println("19. Data Reviewer Verified");
            System.out.println("20. Data Buku Dengan Rating Score Terkecil");
            System.out.println("21. Data Buku Dengan Rating Score Diatas Rata-Rata");
            System.out.println("22. Data Comic Dengan Rating Score Terbesar");

            System.out.println();

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
              default:
                System.out.println("Maaf, Menu Tidak Tersedia");
            }
            System.out.println();

            System.out.print("Ingin memilih menu lain (y/t)? ");
            retry = input.next().charAt(0);

            System.out.println();

          }while (retry != 't');
        }
        System.out.println("Terimakasih...");
    }
}