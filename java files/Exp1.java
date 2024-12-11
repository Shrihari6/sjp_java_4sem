// Different Types of variables

public class Main{ 
    int myvariable = 20; //Instance Variable 
    static int data = 30; //Static Variable 
    public static void main (String args[]){int myvariable = 50; 
    int localvalue = 80; // local Variable 
    Main obj = new Main (); 
    System.out.println("Value of Instance Variable :"+ obj.myvariable); 
    System.out.println("Value of Static Variable :" + Main.data); 
    System.out.println("Value of local Variable :" +localvalue); 
    } 
    }