import childs.Author;
import childs.Mangaka;

public class MainApp {
    public static void main(String[] args) {
        Author person1 = new Mangaka("Devis", "Destian", "Indonesia", "Laki-laki", "romance", 23, "4.5");       
        
        System.out.println(person1);
    }
}