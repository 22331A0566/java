public class Threaddemo extends Thread{
    String name;
    Threaddemo(String name){
        this.name = name;
    }
    public void run(){
        System.out.println("Hello" +name);
    }
    public void start(){
        System.out.println("Start method started");
    }
    public static void main(String args[]){
        Threaddemo t1 = new Threaddemo("harshitha");
        Threaddemo t2 = new Threaddemo("seetha");
        t1.run();
        t2.run();
        t1.start();
        t2.start();
    }
}

