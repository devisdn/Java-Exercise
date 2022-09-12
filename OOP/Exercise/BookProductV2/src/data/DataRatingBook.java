package data;
import java.util.*;
import childs.*;
import classes.*;

public class DataRatingBook {
    
    //18. All reviewer
    public static void getAllReviewer(List<Reviewer> listReviewer){
        for (Reviewer reviewer : listReviewer){
            System.out.println(reviewer);
        }
    }

    //19. All Verified Reviewer
    public static void getAllVerifiedReviewer(List<Reviewer> listReviewer){
        for (Reviewer reviewer : listReviewer){
            if (reviewer.getVerified() == true){
                System.out.println(reviewer);
            }
        }
    }

    //20. Book with low rating score
    public static double getLowRatingScoreBook(List<RatingBook> listRatingBook){
        List<Double> ratingScoreBook = new ArrayList<Double>();
        for (RatingBook ratingBook : listRatingBook) { 
          ratingScoreBook.add(ratingBook.getRatingScore());
        }
        return Collections.min(ratingScoreBook);
    }

    public static void getAllLowRatingScoreBook(List<RatingBook> listRatingBook){
        for (RatingBook ratingBook : listRatingBook){
            if(ratingBook.getRatingScore() == getLowRatingScoreBook(listRatingBook)){
                System.out.println(ratingBook);
            }
        }
    }

    //21. Book with rating score upper than mean
    public static double getMeanRatingScore(List<RatingBook> listRatingBook){
        List<Double> ratingScoreBook = new ArrayList<Double>();
        for (RatingBook ratingBook : listRatingBook) {
            ratingScoreBook.add(ratingBook.getRatingScore());
        }
        double mean = ratingScoreBook.stream().mapToDouble(val -> val).average().orElse(0.0);
        return mean;
    }

    public static void getBookWithRatingUpperThanMean(List<RatingBook> listRatingBook){
        for (RatingBook ratingBook : listRatingBook){
            if (ratingBook.getRatingScore() > getMeanRatingScore(listRatingBook)){
                System.out.println(ratingBook);
            }
        }
    }

    //22. Comic with high rating score
    public static double getHighRatingScoreComic(List<RatingBook> listRatingComic){
        List<Double> ratingScoreComic = new ArrayList<Double>();
        for (RatingBook ratingBook : listRatingComic) {
            if (ratingBook.getBook() instanceof Comic){
                ratingScoreComic.add(ratingBook.getRatingScore());
            }
        }
        return Collections.max(ratingScoreComic);
    }

    public static void getAllHighRatingScoreComic(List<RatingBook> listRatingComic){
        for (RatingBook ratingBook : listRatingComic){
            if (ratingBook.getBook() instanceof Comic){
                if(ratingBook.getRatingScore() == getHighRatingScoreComic(listRatingComic)){
                    System.out.println(ratingBook);
                }
            }
        }
    }
}
