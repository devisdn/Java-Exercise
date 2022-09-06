import childs.person.Author;
import parents.*;
import publisher.*;


public class MainApp {
    public static void main(String[] args) {
        Publisher publisher1 = new Publisher("Gramedia Pustaka Utama", "Indonesia", 48000.0);
        Author author1 = new Author("Devis", "Destian", "Indonesia", 23);
        
        System.out.println(publisher1);
    }
}
