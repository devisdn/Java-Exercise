import childs.*;
import parents.*;
import classes.*;

public class MainApp {
    public static void main(String[] args) {
/*
1. List Rating Mangaka - New Commer - Good - Best Seller
2.  List Quality Paper - HVS - Book Paper - Art Paper - Art Carton - Matte Paper
 */
        //object person
        Person person16 = new Person("Dinda", "Pebrianti", "Indonesia");
        Person person17 = new Person("Anjar", "Hermansyah", "Indonesia");
        Person person18 = new Person("Ripa", "Suripto", "Indonesia");
        Person person19 = new Person("Rubi", "Bduiman", "Indonesia");
        Person person20 = new Person("Fikri", "Natamadja", "Indonesia");

        //object paper
        Paper paper16 = new Paper("HVS", 35000.0);
        Paper paper17 = new Paper("Book Paper", 38000.0);
        Paper paper18 = new Paper("Art Paper", 54400.0);
        Paper paper19 = new Paper("Art Carton", 23000.0);
        Paper paper20 = new Paper("Matte Paper", 58800.0);
        
        //object Author
        Author author16 = new Author("Steve", "McConnel", "Amerika", "Laki-Laki", "Education", 60);
        Author author17 = new Author("Robert C.", "Martin", "Amerika", "Laki-Laki", "Education", 69);
        Author author18 = new Author("Jon", "Duckett", "Amerika", "Laki-Laki", "Education", 48);
        Author author19 = new Author("Kyle", "Simpson", "Amerika", "Perempuan", "Education", 50);
        Author author20 = new Author("Joshua", "Bloch", "Amerika", "Laki-Laki", "Education", 61);
        
        //object customer
        Customer customer16 = new Customer("Devis", "Destian", "Indonesia", "Laki-Laki", "Garut", "0823241232", "44191", "devis@yahoo.com");
        Customer customer17 = new Customer("Aditya", "Mauludin", "Indonesia", "Laki-Laki", "Garut", "089241872", "44191", "adityam@gmail.com");
        Customer customer18 = new Customer("Indra", "Athalla", "Indonesia", "Laki-Laki", "Bandung", "0833681238", "40111", "Athalla_i@live.com");
        Customer customer19 = new Customer("Fira", "Febriani", "Indonesia", "Perempuan", "Bekasi", "082194222", "13175", "fira_28@yahoo.com");
        Customer customer20 = new Customer("Resa", "Maldini", "Indonesia", "Perempuan", "Tanggerang", "0829200122", "12260", "resam_99@outlook.com");
        
        //object reviewer
        Reviewer reviewer16 = new Reviewer("Hibban", "Rizki", "Indonesia", true);
        Reviewer reviewer17 = new Reviewer("Indah", "Wulansari", "Indonesia", true);
        Reviewer reviewer18 = new Reviewer("Sandi", "Falah", "Indonesia", false);
        Reviewer reviewer19 = new Reviewer("Wandi", "Reksen", "Indonesia", true);
        Reviewer reviewer20 = new Reviewer("Billy", "Willy", "Indonesia", false);
        
        //object publisher
        Publisher publisher16 = new Publisher("Gramedia Pustaka Utama", "Indonesia", paper16);
        Publisher publisher17 = new Publisher("Mizan Pustaka", "Indonesia", paper17);
        Publisher publisher18 = new Publisher("Erlangga", "Indonesia", paper18);
        Publisher publisher19 = new Publisher("Bentang Pustaka", "Indonesia", paper19);
        Publisher publisher20 = new Publisher("Republika", "Indonesia", paper20);

        //object mangaka
        Mangaka mangaka16 = new Mangaka("Masashi", "Kishimoto", "Jepang", "Laki-Laki", "Fantasy", 47, "Best Seller");
        Mangaka mangaka17 = new Mangaka("Takao", "Saito", "Jepang", "Laki-Laki", "Fantasy", 85, "Good");
        Mangaka mangaka18 = new Mangaka("Akira", "Toriyama", "Jepang", "Laki-Laki", "Fantasy", 67, "Good");
        Mangaka mangaka19 = new Mangaka("Gosho", "Aoyama", "Jepang", "Laki-Laki", "Fantasy", 59, "Good");
        Mangaka mangaka20 = new Mangaka("Fujiko F", "Fujio", "Jepang", "Laki-Laki", "Fantasy", 88, "Best Seller");
        
        //object book
        Book book16 = new Book("Rapid Development: Taming Wild Software Schedules", "1 Januari 1996", author16, publisher16);
        Book book17 = new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "1 Agustus 1997", author17, publisher17);
        Book book18 = new Book("HTML and CSS: Design and Build Websites", "1 November 2011", author18, publisher17);
        Book book19 = new Book("You Dont Know JS Yet: Get Started", "2 Januari 2020", author19, publisher20);
        Book book20 = new Book("Effective Java", "27 Desember 2017", author20, publisher20);

        //object comic
        Comic comic16 = new Comic("Naruto", "1 Agustus 1997", mangaka16, publisher18, true);
        Comic comic17 = new Comic("Golgo 13", "1 Oktober 1968", mangaka17, publisher19, false);
        Comic comic18 = new Comic("Dragonball", "1 Agustus 1989", mangaka18, publisher19, true);
        Comic comic19 = new Comic("Detective Conan", "1 Januari 1994", mangaka19, publisher18, true);
        Comic comic20 = new Comic("Doraemon", "1 Desember 1969", mangaka20, publisher19, true);

        //object rating book
        RatingBook ratingBook16 = new RatingBook(book16, reviewer16, 4.5);
        RatingBook ratingBook17 = new RatingBook(book17, reviewer17, 4.5);
        RatingBook ratingBook18 = new RatingBook(book18, reviewer18, 4.0);
        RatingBook ratingBook19 = new RatingBook(book19, reviewer19, 3.7);
        RatingBook ratingBook20 = new RatingBook(book20, reviewer20, 4.2);

        //System.out.println(person16); System.out.println(person17); System.out.println(person18); System.out.println(person19); System.out.println(person20);
        //System.out.println(paper16); System.out.println(paper17); System.out.println(paper18); System.out.println(paper19); System.out.println(paper20);
        //System.out.println(author16); System.out.println(author17); System.out.println(author18); System.out.println(author19); System.out.println(author20);
        //System.out.println(customer16); System.out.println(customer17); System.out.println(customer18); System.out.println(customer19); System.out.println(customer20);
        //System.out.println(reviewer16); System.out.println(reviewer17); System.out.println(reviewer18); System.out.println(reviewer19); System.out.println(reviewer20);
        //System.out.println(publisher16); System.out.println(publisher17); System.out.println(publisher18); System.out.println(publisher19); System.out.println(publisher20);
        //System.out.println(mangaka16); System.out.println(mangaka17); System.out.println(mangaka18); System.out.println(mangaka19); System.out.println(mangaka20);
        //System.out.println(book16); System.out.println(book17); System.out.println(book18); System.out.println(book19); System.out.println(book20);
        //System.out.println(comic16); System.out.println(comic17); System.out.println(comic18); System.out.println(comic19); System.out.println(comic20);
        //System.out.println(ratingBook16); System.out.println(ratingBook17); System.out.println(ratingBook18); System.out.println(ratingBook19); System.out.println(ratingBook20);
    }
}