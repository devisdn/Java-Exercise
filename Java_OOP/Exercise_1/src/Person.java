public class Person {
    String name;
    String address;
    final  String country = "Indonesia";

    //constructor default
    Person(){

    }
    //constructor with parameter
    Person(String paramName, String paramAdress){
        name = paramName;
        address = paramAdress;
    }

    void sayHello(String paramName){
        System.out.println("Hello, " + paramName + ". Nama Saya " + name + ".");
    }

    String sayAdress(){
        return  "Saya dari " + address + ".";
    }
}
