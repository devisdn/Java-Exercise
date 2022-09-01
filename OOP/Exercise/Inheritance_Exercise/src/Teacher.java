public class Teacher extends Person{
    String subject;

    public Teacher(){}

    public Teacher(String name, String address) {
        super(name, address);
    }

    void teaching(){
        System.out.println("I can teach " + subject + ", So anyone how wants to learn can talk to me.");
    }
}
