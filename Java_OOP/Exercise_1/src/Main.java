public class Main {
    public static void main(String[] args){
        //make new object with default constructor
        Person person1 = new Person();
        person1.name = "Devis";
        person1.address = "Garut";

        person1.sayHello("Padepokan 79");
        System.out.println(person1.sayAdress());

        //make new object with a constructor with parameter
        Person person2 = new Person("Elon", "US");
        person2.sayHello("Padepokan 79");
        System.out.println(person2.sayAdress());
    }
}
