class Student {
  private
    double semper = 85.3;
    void stdsem(){
        System.out.println("My percentage is "+semper+" (private).");
    }
  protected
    int num = 66;
    void stdnum(){
          System.out.println("My num is "+num+"(protected)");
        }
  public
    String name = "Harshitha";
    void studname(){
      System.out.println("My name is "+name+" (public).");
    }
// function to access private member
    double getPVT() 
    {
      System.out.println("My percentage is "+semper+" (private).");
      return semper;
    }
}
class details extends Student {
  public
    // function to access protected member from Base
    int getProt() {
        System.out.println("My num is "+num+" (protected).");
        return num;
    }
}
public class ppp {  
  public static void main(String args[]) 
  {
    details object = new details();
    object.studname();
    object.getProt();
    //object.getPVT();
    object.stdsem();
  }
}
