public class Main {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Devis";
        person1.address = "Garut";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Padepokan 79");
    }
}
