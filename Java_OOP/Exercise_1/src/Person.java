public class Person {
    String name;
    String address;
    final  String country = "Indonesia";

    void sayHello(String paramName){
        System.out.println("Hello, " + paramName + ". Nama Saya " + name + " dari " + address + ".");
    }
}
