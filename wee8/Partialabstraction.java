import java.util.Scanner;

abstract class Chocolate {
    public void chocolateType() {
        System.out.println("Dairy Milk chocolate");
    }

    abstract void brand();
    abstract void cost();
}

class DairyMilk extends Chocolate {
    public void brand() {
        System.out.println("It's Dairy Milk brand");
    }

    public void cost() {
        System.out.println("Below 250 Rs");
    }
}

public class Partial {
    public static void main(String args[]) {
        DairyMilk obj = new DairyMilk();
        obj.chocolateType();
        obj.brand();
        obj.cost();
    }
}
