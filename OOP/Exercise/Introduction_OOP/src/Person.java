public class Person {
    String name;
    String address;
    final  String country = "Indonesia";

    //constructor default
    Person(){

    }
    //constructor with 1 parameter
    Person(String paramName){
        name = paramName;
    }
    //constructor with 2 parameters
    Person(String name, String address){
        //using "this" to avoid variable shadowing
        this.name = name;
        this.address = address;
    }

    void sayHello(String paramName){
        System.out.println("Hello, " + paramName + ". Nama Saya " + name + ".");
    }

    String sayAdress(){
        return  "Saya dari " + address + ".";
    }
}
