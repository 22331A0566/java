import java.util.Scanner;
class consdest1{
    String collegename;
    int collegecode;
    String name;
    double percentage;

    consdest1(){
        collegename="mvgr";
        collegecode=33; 
    }
    consdest1(String fullname,double sempercentage){
        name=fullname;
        percentage=sempercentage;
    }
    void display(){
        System.out.println("name is:"+name);
        System.out.println("percentage"+percentage);
        System.out.println("college name:"+collegename);
        System.out.println("collegecode"+collegecode);

    }
    public static void main(String args[]){
        consdest1 n=new consdest1("harshitha",79);
        consdest1 m=new consdest1();
        System.out.println("fullname is:   "+n.name);
        System.out.println(" sempercentage   "+n.percentage);
        System.out.println(" college name  "+m.collegename);
        System.out.println("  college code   "+m.collegecode);
      
}
}
