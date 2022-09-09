package repositories;

import childs.*;
import parents.*;
import classes.*;
import java.util.*;

public class BookRepositori {


    public static Map<String, Object> getAllBookAndRating(){
        List<Book>  listBook = new ArrayList<Book>();
        List<Publisher> listPublisher = new ArrayList<Publisher>();

        Paper paper1 = new Paper("Best", 10000.0);
        Paper paper2 = new Paper("Good", 7000.0);
        Paper paper3 = new Paper("Low", 5000.0);
        Paper paper4 = new Paper("Good", 120000.0);
        Paper paper5 = new Paper("Best", 150000.0);

        Paper paper6 = new Paper("Good", 37000.0);
        Paper paper7 = new Paper("Intermediate", 30000.0);
        Paper paper8 = new Paper("Bad", 45000.0);
        Paper paper9 = new Paper("Good", 38000.0);
        Paper paper10 = new Paper("Intermediate", 40000.0);

        Paper paper11 = new Paper("low",400.0);
        Paper paper12 = new Paper("low",500.0);
        Paper paper13 = new Paper("Good",600.0);
        Paper paper14 = new Paper("Best",700.0);
        Paper paper15 = new Paper("Best",900.0);

        Paper paper16 = new Paper("HVS", 35000.0);
        Paper paper17 = new Paper("Book Paper", 38000.0);
        Paper paper18 = new Paper("Art Paper", 54400.0);
        Paper paper19 = new Paper("Art Carton", 23000.0);
        Paper paper20 = new Paper("Matte Paper", 58800.0);

        Paper paper21 = new Paper("Good", 65000.0);
        Paper paper22 = new Paper("Best", 51000.0);
        Paper paper23 = new Paper("Fair", 64100.0);
        Paper paper24 = new Paper("Good", 38325.0);
        Paper paper25 = new Paper("Fair", 31500.0);

        Publisher publisher1 = new Publisher("Dwi Airlangga","Indonesia",paper2);
        Publisher publisher2 = new Publisher("Kodansha","Japan",paper5);
        Publisher publisher3 = new Publisher("Hakusensha","Japan",paper4);
        Publisher publisher4 = new Publisher("publisher25","Indonesia",paper1);
        Publisher publisher5 = new Publisher("Pustaka Cipta","Indonesia",paper3);

        Publisher publisher6 = new Publisher("publisher23", "Indonesia", paper6);
        Publisher publisher7 = new Publisher("publisher25 Pustaka", "Indonesia", paper7);
        Publisher publisher8 = new Publisher("Bentang Pustaka", "Indonesia", paper8);
        Publisher publisher9 = new Publisher("publisher25", "Indonesia", paper9);
        Publisher publisher10 = new Publisher("publisher23", "Indonesia", paper10);
        Publisher publisher11 = new Publisher("Marvel Entertainment International Ltd","England", paper11);

        Publisher publisher12 = new Publisher("John Wiley & Sons, Inc","United States", paper12);
        Publisher publisher13 = new Publisher("Nature America","United States", paper13);
        Publisher publisher14 = new Publisher("Scholastic, Inc.","United States", paper14);
        Publisher publisher15 = new Publisher("Macmillan Education","England", paper15);
        
        Publisher publisher16 = new Publisher("publisher25 Pustaka Utama", "Indonesia", paper16);
        Publisher publisher17 = new Publisher("publisher24 Pustaka", "Indonesia", paper17);
        Publisher publisher18 = new Publisher("publisher23", "Indonesia", paper18);
        Publisher publisher19 = new Publisher("Bentang Pustaka", "Indonesia", paper19);
        Publisher publisher20 = new Publisher("publisher25", "Indonesia", paper20);
        
        Publisher publisher21 = new Publisher("publisher25 Pustaka", "Indonesia", paper21);
        Publisher publisher22 = new Publisher("publisher22", "Indonesia", paper22);
        Publisher publisher23 = new Publisher("publisher23", "Indonesia", paper23);
        Publisher publisher24 = new Publisher("publisher24 Pustaka", "Indonesia", paper24);
        Publisher publisher25 = new Publisher("Penerbit publisher25", "Indonesia", paper25);

        Author author1 = new Author("Ihsan","Nugraha","Indonesia","Male","Romance",25);
        Author author2 = new Author("J.R.R.","Tolkien","Inggris","Male","Fiction Fantasy",24);
        Author author3 = new Author("Kartini","Armijn Pane","Indonesia","Male","Action",25);
        Author author4 = new Author("Raditya","Dika","Indonesia","Male","Comedy",25);
        Author author5 = new Author("Merle","Calvin","Indonesia","Male","Clasic",23);
        
        Author author6 = new Author("Eka", "Kurniawan", "Indonesia", "Male", "Comedy", 30);
        Author author7 = new Author("Ziggy", "Zezsyazeoviennazabrizkie", "Indonesia", "Male", "Horror", 30);
        Author author8 = new Author("Aliyah", "Putri", "Indonesia", "Female", "Horror", 30);
        Author author9 = new Author("Isabela", "Ananda", "Malaysia", "Female", "Action", 30);
        Author author10 = new Author("Henzie", "Callista", "England", "Female", "Romance", 30);
        
        Author author11 = new Author("Susie","Rae", "England","Female","Fiction",35);
        Author author12 = new Author("A","Osterwalder", "United States","Male","Business",55);
        Author author13 = new Author("Patrick ","O'Dowd", "United States","Male","Education",45);
        Author author14 = new Author("Sylvan","Rae", "United States","Male","Education",45);
        Author author15 = new Author("Conan","Doyle", "England","Male","Fiction",37);
        
        Author author16 = new Author("Steve", "McConnel", "Amerika", "Male", "Education", 60);
        Author author17 = new Author("Robert C.", "Martin", "Amerika", "Male", "Education", 69);
        Author author18 = new Author("Jon", "Duckett", "Amerika", "Male", "Education", 48);
        Author author19 = new Author("Kyle", "Simpson", "Amerika", "Female", "Education", 50);
        Author author20 = new Author("Joshua", "Bloch", "Amerika", "Male", "Education", 61);
        
        Author raditya = new Author("Raditya", "Dika", "Indonesia", "Male", "Fiction",37 );
        Author tere = new Author("Tere", "Liye", "Indonesia", "Male", "Supranatural", 43);
        Author andrea = new Author("Andrea", "Hirata", "Indonesia", "Male", "Motivational",54);
        Author pidi = new Author("Pidi", "Baiq", "Indonesia", "Male",  "Motivational",50);
        Author reki = new Author("Reki", "Kawahara", "Japan", "Male",  "Fiction",48);

        Mangaka mangaka1 = new Mangaka("Oda","Sensei","Japan","Male","Action",30,"Best Seller");
        Mangaka mangaka2 = new Mangaka("Masashi","Kisimoto","Japan","Male","Action",35,"Best Seller");
        Mangaka mangaka3 = new Mangaka("Yasuke","Murata","Japan","Male","Action",40,"Best Seller");
        Mangaka mangaka4 = new Mangaka("Ichigo","Kurosaki","Japan","Male","Action",25,"Good");
        Mangaka mangaka5 = new Mangaka("Hinata","Shoyo","Japan","Male","Sports",27,"New Commer");
        
        Mangaka mangaka6 = new Mangaka("Tsugumi", "Ohba", "japan", "male", "Comedy", 30, "Best Seller");
        Mangaka mangaka7 = new Mangaka("Eiichiro", "Oda", "Japan", "male", "Thriller", 30, "Good");
        Mangaka mangaka8 = new Mangaka("Ken", "Waqui", "japan", "Male", "Horror", 30, "New Commer");
        Mangaka mangaka9 = new Mangaka("Hiroyuki", "takei", "japan", "Male", "Action", 30, "Good");
        Mangaka mangaka10 = new Mangaka("Jeje", "Akutami", "Japan", "Male", "Romance", 30, "New Commer");
        
        Mangaka mangaka11 = new Mangaka("Ricardo","Barreiro","Argentina","Male","Fiction",80,"Good");
        Mangaka mangaka12 = new Mangaka("Rutu","Modan","Israel","Female","Fiction",56,"New Comer");
        Mangaka mangaka13 = new Mangaka("Massimo","Belardinelli","Italy","Male","science fiction",68,"Best");
        Mangaka mangaka14 = new Mangaka("Billy","Tan","Malaysia","Male","Fiction", 52,"Good");
        Mangaka mangaka15 = new Mangaka("Yohanes","Surya","Indonesia","Male","science",63,"Good");
        
        Mangaka mangaka16 = new Mangaka("Masashi", "Kishimoto", "Jepang", "Male", "Fantasy", 47, "Best Seller");
        Mangaka mangaka17 = new Mangaka("Takao", "Saito", "Jepang", "Male", "Fantasy", 85, "Good");
        Mangaka mangaka18 = new Mangaka("Akira", "Toriyama", "Jepang", "Male", "Fantasy", 67, "Good");
        Mangaka mangaka19 = new Mangaka("Gosho", "Aoyama", "Jepang", "Male", "Fantasy", 59, "Good");
        Mangaka mangaka20 = new Mangaka("Fujiko F", "Fujio", "Jepang", "Male", "Fantasy", 88, "Best Seller");

        Mangaka masashi = new Mangaka("Masashi", "Kishimoto", "Japan", "Male","Action", 47,  "Best Seller");
        Mangaka oda = new Mangaka("Eiichiro", "Oda", "Japan", "Male",  "Action", 47,"Best Seller");
        Mangaka tara = new Mangaka("Diwantara", "Putra", "Indonesia", "Male",  "Drama",33, "New Comer");
        Mangaka fujiko = new Mangaka("Fujiko", "Fujio", "Japan", "Male",  "Comedy", 88,"Best Seller");
        Mangaka indra = new Mangaka("Indra", "AD", "Indonesia", "Male",  "Comedy",28, "Good");

        Book book1 = new Book("Diantara Kita","05 September 2017",author1,publisher1);
        Book book2 = new Book("The Hobbits","21 September 1937",author2,publisher3);
        Book book3 = new Book("Habis Gelap Terbitlah Terang","29 Januari 2005",author3,publisher3);
        Book book4 = new Book("Manusia Setengah Salmon"," Desember 2011",author4,publisher5);
        Book book5 = new Book("Sejarah Indonesia Modern","2008",author5,publisher4);

        Book book6 = new Book("Cantik Itu Luka", "19 September 2002", author6, publisher6);
        Book book7 = new Book("Kita Pergi Hari Ini", "10 Januari 2010", author7, publisher7);
        Book book8 = new Book("Hujan", "20 Oktober 2019", author8, publisher8);
        Book book9 = new Book("Laskar Pelangi", "1 September 2009", author9, publisher9);
        Book book10 = new Book("Ayat-ayat Cinta", "20 Juli 2018", author10, publisher10);

        Book book11 = new Book("What Would Hulk Do?","28 October 2021",author11,publisher11);
        Book book12 = new Book("Business Model Generation","20 Augustus 2010",author12,publisher12);
        Book book13 = new Book("United States","1 December 1984",author13,publisher13);
        Book book14 = new Book("00 Words Kids Need to Read","1 January 2002",author14,publisher14);
        Book book15 = new Book("The Norwood Builder and Other Stories","28 October 2021",author15,publisher15);

        Book book16 = new Book("Rapid Development: Taming Wild Software Schedules", "1 Januari 1996", author16, publisher16);
        Book book17 = new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "1 Agustus 1997", author17, publisher17);
        Book book18 = new Book("HTML and CSS: Design and Build Websites", "1 November 2011", author18, publisher17);
        Book book19 = new Book("You Dont Know JS Yet: Get Started", "2 Januari 2020", author19, publisher20);
        Book book20 = new Book("Effective Java", "27 Desember 2017", author20, publisher20);

        Book book21 = new Book("Manusia Setengah Salmon", "21 Desember", raditya, publisher21);
        Book book22 = new Book("Bulan", "31 April", tere, publisher22);
        Book book23 = new Book("Laskar Pelangi", "4 Juni", andrea, publisher23);
        Book book24 = new Book("Dilan 1990", "3 April", pidi, publisher24);
        Book book25 = new Book("Sword Art Online: Jilid 1", "releaseDate", reki, publisher25);

        Comic comic1 = new Comic("One Pice","22 Juli 1997.",mangaka1,publisher2,true);
        Comic comic2 = new Comic("Naruto","1999",mangaka2,publisher3,true);
        Comic comic3 = new Comic("One Punch Man","2009",mangaka3,publisher2,true);
        Comic comic4 = new Comic("Bleach","Agustus 2001",mangaka4,publisher3,false);
        Comic comic5 = new Comic("Haikyu","Februari 2012",mangaka5,publisher2,false);
        
        Comic comic6 = new Comic("Death Note Short Stories", "20 Januari 2021", mangaka6, publisher6, true);
        Comic comic7 = new Comic("One Piece 98", "20 September 2000", mangaka7, publisher7, false);
        Comic comic8 = new Comic("Tokyo Revengers 01", "20 Oktober 2021", mangaka8, publisher8, true);
        Comic comic9 = new Comic("Shaman King Complete Edition 03", "10 Maret 2021", mangaka9, publisher9, true);
        Comic comic10 = new Comic("Jujutsu Kaisen 05", "20 Agustus 2021", mangaka10, publisher10, false);

        Comic Comic11 = new Comic("Le couvent infernal","19 March 2015",mangaka11,publisher11,true);
        Comic Comic12 = new Comic("The Property HC","13 March 2013",mangaka12,publisher12,true);
        Comic Comic13 = new Comic("The John Probe Mission Files","22 March 2018",mangaka13,publisher13,true);
        Comic Comic14 = new Comic("Uncanny X-Men","1 January 2003",mangaka14,publisher14,true);
        Comic Comic15 = new Comic("Fisika Vs Yohanes Surya"," 22 May 2018",mangaka15,publisher15,true);

        Comic comic16 = new Comic("Naruto", "1 Agustus 1997", mangaka16, publisher18, true);
        Comic comic17 = new Comic("Golgo 13", "1 Oktober 1968", mangaka17, publisher19, false);
        Comic comic18 = new Comic("Dragonball", "1 Agustus 1989", mangaka18, publisher19, true);
        Comic comic19 = new Comic("Detective Conan", "1 Januari 1994", mangaka19, publisher18, true);
        Comic comic20 = new Comic("Doraemon", "1 Desember 1969", mangaka20, publisher19, true);

        Comic comic21 = new Comic("Naruto", "1998", masashi, publisher21, true);
        Comic comic22 = new Comic("One Piece", "1999", oda, publisher22, true);
        Comic comic23 = new Comic("Dia Lagi!", "2021", tara, publisher23, true);
        Comic comic24 = new Comic("Doraemon dan Dinosaurus", "2009", fujiko, publisher24, false);
        Comic comic25 = new Comic("Dracko Diary", "2015", indra, publisher25, true);

        Reviewer reviewer1 = new Reviewer("Randi","Rivani","Indonesia",true);
        Reviewer reviewer2 = new Reviewer("Rival","Firmansyah","Indonesia",false);
        Reviewer reviewer3 = new Reviewer("Chaswandi","Firmansyah","Indonesia",true);
        Reviewer reviewer4 = new Reviewer("Nana","Hidayat","Indonesia",false);
        Reviewer reviewer5 = new Reviewer("Muhammad","Reza","Indonesia",true);

        Reviewer reviewer6 = new Reviewer("Asa", "Lemke", "Denmark", true);
        Reviewer reviewer7 = new Reviewer("Ardella", "Kuhn", "England", false);
        Reviewer reviewer8 = new Reviewer("jayson", "Legros", "US", false);
        Reviewer reviewer9 = new Reviewer("Mubdi", "karunia", "Indonesia", true);
        Reviewer reviewer10 = new Reviewer("Reisa", "padma", "Indonesia", true);

        Reviewer reviewer11 = new Reviewer("Arul","Dimas","Indonesia",false);
        Reviewer reviewer12 = new Reviewer("Resta","nur Haniza","Indonesia",true);
        Reviewer reviewer13 = new Reviewer("Murni","Salfa","Indonesia",true);
        Reviewer reviewer14 = new Reviewer("Suci","nurhayani","Indonesia",true);
        Reviewer reviewer15 = new Reviewer("yesiva","Ayu","Indonesia",false);

        Reviewer reviewer16 = new Reviewer("Hibban", "Rizki", "Indonesia", true);
        Reviewer reviewer17 = new Reviewer("Indah", "Wulansari", "Indonesia", true);
        Reviewer reviewer18 = new Reviewer("Sandi", "Falah", "Indonesia", false);
        Reviewer reviewer19 = new Reviewer("Wandi", "Reksen", "Indonesia", true);
        Reviewer reviewer20 = new Reviewer("Billy", "Willy", "Indonesia", false);

        Reviewer arif = new Reviewer("Arif", "Yudistira", "Indonesia", true);
        Reviewer kurnia = new Reviewer("Kurnia", "Salam", "Indonesia", false);
        Reviewer patris = new Reviewer("Patris", "Kurnia", "Indonesia", true);
        Reviewer akhmad = new Reviewer("Akhmad", "Idris", "Indonesia", false);
        Reviewer ubaidillah = new Reviewer("Ubaidillah", "Rosyid", "Indonesia", true);

        RatingBook rating1 = new RatingBook(comic1,reviewer1,10.0);
        RatingBook rating2 = new RatingBook(comic2,reviewer2,9.5);
        RatingBook rating3 = new RatingBook(comic3,reviewer3,9.0);
        RatingBook rating4 = new RatingBook(comic4,reviewer4,8.5);
        RatingBook rating5 = new RatingBook(comic5,reviewer5,8.0);


        RatingBook ratingBook1 = new RatingBook(book11,reviewer11,90.0);
        RatingBook ratingBook2 = new RatingBook(book12,reviewer12,80.0);
        RatingBook ratingBook3 = new RatingBook(book13,reviewer13,80.0);
        RatingBook ratingBook4 = new RatingBook(book14,reviewer14,90.0);
        RatingBook ratingBook5 = new RatingBook(book15,reviewer15,70.0);

        RatingBook ratingBook6 = new RatingBook(book6, reviewer6, 3.5);
        RatingBook ratingBook7 = new RatingBook(book7, reviewer7, 4.5);
        RatingBook ratingBook8 = new RatingBook(book8, reviewer8, 4.1);
        RatingBook ratingBook9 = new RatingBook(book9, reviewer9, 4.0);
        RatingBook ratingBook10 = new RatingBook(book10, reviewer10, 3.9);

        RatingBook ratingBook16 = new RatingBook(book16, reviewer16, 4.5);
        RatingBook ratingBook17 = new RatingBook(book17, reviewer17, 4.5);
        RatingBook ratingBook18 = new RatingBook(book18, reviewer18, 4.0);
        RatingBook ratingBook19 = new RatingBook(book19, reviewer19, 3.7);
        RatingBook ratingBook20 = new RatingBook(book20, reviewer20, 4.2);

        RatingBook rating21 = new RatingBook(book21, arif, 4.3);
        RatingBook rating22 = new RatingBook(book22, kurnia, 3.9);
        RatingBook rating23 = new RatingBook(book23, patris, 4.2);
        RatingBook rating24 = new RatingBook(book24, akhmad, 4.6);
        RatingBook rating25 = new RatingBook(book25, ubaidillah, 3.3);

/*      Customer cust1 = new Customer("Adam","Fariz","Indonesia","Male","Cibatu, Garut, West Java","089587652938","44197","adamfariz@gmail.com");
        Customer cust2 = new Customer("Novia","Alawiyah","Indonesia","Female","Wanaraja, Garut, West Java","081388657620","44183","noviaa@gmail.com");
        Customer cust3 = new Customer("Tina","Maryana","Indonesia","Female","Garut Kota, Garut, West Java","089529830087","44180","maryanatina@gmail.com");
        Customer cust4 = new Customer("Mark","Zuckerberg","America","Male","Palo Alto","(+1)650-543-4800","94020","zuckerberg@fb.com");
        Customer cust5 = new Customer("Jack","Ma","China","Male","Hangzhou","(+86) 571-8502-2088","242332","jackma@hotmail.com");


        Person person16 = new Person("Dinda", "Pebrianti", "Indonesia");
        Person person17 = new Person("Anjar", "Hermansyah", "Indonesia");
        Person person18 = new Person("Ripa", "Suripto", "Indonesia");
        Person person19 = new Person("Rubi", "Bduiman", "Indonesia");
        Person person20 = new Person("Fikri", "Natamadja", "Indonesia"); */

/*      Customer customer16 = new Customer("Devis", "Destian", "Indonesia", "Male", "Garut", "0823241232", "44191", "devis@yahoo.com");
        Customer customer17 = new Customer("Aditya", "Mauludin", "Indonesia", "Male", "Garut", "089241872", "44191", "adityam@gmail.com");
        Customer customer18 = new Customer("Indra", "Athalla", "Indonesia", "Male", "Bandung", "0833681238", "40111", "Athalla_i@live.com");
        Customer customer19 = new Customer("Fira", "Febriani", "Indonesia", "Female", "Bekasi", "082194222", "13175", "fira_28@yahoo.com");
        Customer customer20 = new Customer("Resa", "Maldini", "Indonesia", "Female", "Tanggerang", "0829200122", "12260", "resam_99@outlook.com"); */

/* 
        Person person6 = new Person("Luis", "Alberto", "Brazil");
        Person person7 = new Person("Lucas", "Hernandez", "France");
        Person person8 = new Person("Regina", "Wulandari", "Indonesia");
        Person person9 = new Person("Eric", "Bailey", "Hungary");
        Person person10 = new Person("Mateo", "Lijkovic", "Croatia"); */

/* 
        Customer customer6 = new Customer("Ficko", "Azhar", "Indonesia", "Male", "Cilacap", "081678673928", "53245", "ficko@gmail.com");
        Customer customer7 = new Customer("Adelia", "Mawardhi", "Indonesia", "Female", "Purwokerto", "08178439382", "56321", "adelia@gmail.com");
        Customer customer8 = new Customer("Narcisco", "ryan", "Columbia", "Male", "Bogota", "087839273892", "53324", "narcisco@gmail.com");
        Customer customer9 = new Customer("Sofia", "rahmadani", "Indonesia", "Female", "Kutai", "081783748209", "53819", "sofia@gmail.com");
        Customer customer10 = new Customer("Dimas", "didan", "Indonesia", "Male", "Yogyakarta", "081903948293", "09498", "dimas@gmail.com"); */

 /*     Person person11 = new Person("Syahril","Lukman","indonesia");
        Person person12 = new Person("Akbar","galang","indonesia");
        Person person13 = new Person("Muhammad","Rizki","indonesia");
        Person person14 = new Person("Widi","widia","indonesia");
        Person person15 = new Person("Robi","rohendi","indonesia"); */

/*      Customer Customer11 = new Customer("Andre","Kurniadi","Indonesia","Male","Bandung Barat","0821219172822","40554","andre@gmail.com");
        Customer Customer12 = new Customer("Rendi","saputra","Indonesia","Male","Jakarta","08789987621","77832","rendiss43@gmail.com");
        Customer Customer13 = new Customer("Ima","Holilatul","Malaysia","Female","Johor Baru","0837266372","34323","imaholola@gmail.com");
        Customer Customer14 = new Customer("Hyon","park","korea","Female","Busan","0827136713","342342","Hyonpart4@gmail.com");
        Customer Customer15 = new Customer("Rian","Sofia","Indonesia","Male","jakrta","0873728372","35332","riansof43@gmial.com"); */

/*      Person irfan = new Person("Irfan", "Adi", "Indonesia");
        Person devis = new Person("Devis", "Destian", "Indonesia");
        Person ficko = new Person("Ficko", "Azhar", "Indonesia");
        Person ihsan = new Person("Ihsan", "Nugraha", "Indonesia");
        Person syahril = new Person("Syahril", "Lukman", "Indonesia"); */

/*      Customer surya = new Customer("Surya", "Iman", "Indonesia", "Male", "Bogor", "081384098351", "16610", "suryaiman@gmail.com");
        Customer melissa = new Customer("Melissa", "Anggari", "Indonesia", "Female", "Jakarta", "089344905769", "16115", "melissaanggari@gmail.com");
        Customer karolina = new Customer("Carolina", "Angela", "Indonesia", "Female", "Depok", "089944325589", "18445", "carolinaangela@gmail.com");
        Customer arvi = new Customer("Arvi", "Andhika", "Indonesia", "Male", "Bekasi", "094455882233", "13550", "arviandhika@gmail.com");
        Customer henzie = new Customer("Henzie", "Sulistia", "Indonesia", "Female", "Banten", "083355890139", "14189", "henziesulistia@gmail.com"); */

        listBook= new ArrayList<Book>(Arrays.asList(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10,
                book11,book12, book13, book14, book15,book16, book17, book18,book19,book20,book21, book22,book23,book24,book25,
                comic1, comic2, comic3, comic4, comic5, comic6, comic7,comic8, comic9, comic10,
                Comic11, Comic12, Comic13, Comic14, Comic15, comic16, comic17, comic18, comic19, comic20, comic21, comic22,
                comic23, comic24, comic25 ));
        listPublisher = new ArrayList<Publisher>(Arrays.asList(publisher1, publisher2, publisher3, publisher4, publisher5, publisher6, publisher7, publisher8,
                publisher9, publisher10, publisher11, publisher12, publisher13, publisher14, publisher15, publisher16, publisher17, publisher18, publisher19, publisher20,
                publisher25, publisher22, publisher23, publisher24, publisher25 ));
        Map<String,Object> result = new HashMap<String,Object>();

        List<RatingBook> listRatingBook = new ArrayList<RatingBook>(Arrays.asList(rating1, rating2, rating3, rating4, rating5, rating21, rating22, rating23, rating24, rating25, ratingBook1, ratingBook2, ratingBook3, ratingBook4, ratingBook5, ratingBook6, ratingBook7, ratingBook8, ratingBook9, ratingBook10, ratingBook16,ratingBook17, ratingBook18, ratingBook19, ratingBook20));
        
        result.put("listBook", listBook);
        result.put("listRatingBook", listRatingBook );
        result.put("listPublisher", listPublisher);

        return result;
    }
}
