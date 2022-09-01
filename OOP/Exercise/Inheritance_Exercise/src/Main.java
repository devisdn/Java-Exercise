public class Main {
    public static void main(String[] args) {
        Person person1 =  new Person();
        person1.name = "Devis";
        person1.address = "Garut";

        Teacher teacher1 = new Teacher();
        teacher1.name = "Rubi";
        teacher1.address = "Garut";

        Teacher teacher2 = new Teacher("Randi", "Bandung");

        person1.greeting();
        teacher1.greeting();
        teacher2.greeting();
    }
}
