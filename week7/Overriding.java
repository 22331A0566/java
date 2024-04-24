class Harshitha {
    public void showFeature() {
        System.out.println("I have a feature where we are similar in some aspects.");
    }

    public void showFeature(String featureName) {
        System.out.println("Feature Name: " + featureName);
    }
}

public class Main {
    public static void main(String[] args) {
        Harshitha obj = new Harshitha();
        obj.showFeature();
        obj.showFeature("Smart Harshitha");
    }
}
