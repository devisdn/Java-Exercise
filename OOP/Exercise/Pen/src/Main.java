public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Hauser", "Stylus", "H2005");
        Pen pen2 = new Pen("Hauser", "Celebrity", "H6077");
        Pen pen3 = new Pen("Hauser", "Brussels", "H6101");
        String features1[] = {"Futuristic Stylus Embedded Design", "Twist Mechanism", "Satin Finish Body"},
        features2[] = {"Ultra-Light Aluminium Body","Textured Body at Grip for Better Hold","Stylish Matt Finish"},
        features3[] = {"Brush Finish Body","Textured Grip for Better Writing","Designer Clip"};

        pen1.bodyColor = "Grey";
        pen1.inkColor = "Black";
        pen1.mechanism = "Ball Pen";
        pen1.inkCapacity = 2.5;
        pen1.tipSize = 1.0;
        pen1.dimension = 12.8;
        pen1.isRefillable = true;
        pen1.isOpen = true;
        pen1.isStylus = true;
        pen1.features = features1;

        pen2.bodyColor = "Pink";
        pen2.inkColor = "Blue";
        pen2.mechanism = "Retractable Ball Pen";
        pen2.inkCapacity = 2.5;
        pen2.tipSize = 0.7;
        pen2.dimension = 12.8;
        pen2.isRefillable = true;
        pen2.isOpen = true;
        pen2.isStylus = false;
        pen2.features = features2;

        pen3.bodyColor = "Black";
        pen3.inkColor = "Blue";
        pen3.mechanism = "Retractable Ball Pen";
        pen3.inkCapacity = 2.5;
        pen3.tipSize = 0.7;
        pen3.dimension = 15.0;
        pen3.isRefillable = true;
        pen3.isOpen = true;
        pen3.isStylus = false;
        pen3.features = features3;

        pen1.detailing();
        pen1.refilling(pen1.inkCapacity, pen1.inkColor);
        pen1.writing(pen1.inkCapacity);
        pen1.open(pen1.isOpen);

        pen2.detailing();
        pen2.refilling(pen2.inkCapacity, pen2.inkColor);
        pen2.writing(pen2.inkCapacity);
        pen2.open(pen2.isOpen);

        pen3.detailing();
        pen3.refilling(pen3.inkCapacity, pen3.inkColor);
        pen3.writing(pen3.inkCapacity);
        pen3.open(pen3.isOpen);
    }
}
