public class Pen {
    //Attributes
    String merk, serialName, serialCode, bodyColor, inkColor, features [], mechanism;
    Double inkCapacity, tipSize, dimension;
    boolean isRefillable, isOpen, isStylus;

    //Constructor
    Pen(){}
    Pen(String merk){
        this.merk = merk;
    }
    Pen(String merk, String serialName, String serialCode){
        this.merk = merk;
        this.serialName = serialName;
        this.serialCode = serialCode;
    }

    //Method
    void open(Boolean paramName){
        if (paramName = true){
            System.out.println("Pen is Open.\n");
        } else{
            System.out.println("Pen is Close.\n");
        }
    }
    void close(Boolean isOpen){
        if (isOpen = true){
            System.out.println("Pen is Close.\n");
        } else{
            System.out.println("Pen is Open.\n");
        }
    }

    void refilling(double inkCapacity, String inkColor){
        this.inkColor = inkColor;
        this.inkCapacity = inkCapacity;
        System.out.println("Your pen is refilled with " + inkCapacity + " ml " + inkColor + " ink capacity");
    }
    
    Boolean writing(Double inkCapacity){
        if (isOpen = true){
            if (inkCapacity <= 0.0){
                System.out.println("This pen can't be used for writing.");
            }else{
                System.out.println("This pen can be used for writing.");
            }
        }else if(isOpen = false){
            System.out.println("Pen is closed. Open it first!");
        }
        return isOpen;
    }

    void detailing(){
        System.out.println("====== PEN DETAILS ======");
        System.out.println("Merk Pulpen\t\s\s: " + merk);
        System.out.println("Nama Seri Pulpen\s\s: " + serialName);
        System.out.println("Kode Seri Pulpen\s\s: " + serialCode);
        System.out.println("Warna Pulpen\t\s\s: " + bodyColor);
        System.out.println("Warna Tinta\t\s\s: " + inkColor);
        System.out.println("Kapasitas Tinta\t\s\s: " + inkCapacity + " ml");
        System.out.println("Mekanisme Pulpen\s\s: " + mechanism);
        System.out.println("Ukuran Tip Pulpen\s: " + tipSize + " mm");
        System.out.println("Dimensi Pulpen\t\s\s: " + dimension + " mm");
        System.out.println("Refillable\t\s\s: " + isRefillable );
        System.out.println("Pulpen Stylus\t\s\s: " + isStylus);
        for (String description : features) {
            System.out.println("* "+ description);
        }
    }

/*     1. void openPen(isOpen)
2. void closePen(isOpen)
3. void refillPen(inkCapacity, inkColour)
4. String writing(isOpen, inkCapacity);
5. void getPenDetails(); */
}
