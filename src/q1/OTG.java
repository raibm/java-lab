package q1;

public class OTG extends PenDrive{
    String make;
    String type;

    OTG(int capacity, String tye){
        super(capacity);
        this.type = tye;
    }

    OTG(String make){
        super(128);
        this.make = make;
    }
}
