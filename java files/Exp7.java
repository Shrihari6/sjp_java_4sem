// Diffeerent types of constructors

class Rectangle{ // Default Constructor 
    int length; 
    int width; 
    Rectangle(){ // No Arg Constructor 
    length = 10; 
    width = 10; 
    } 
    Rectangle(int l, int w){ // Parameterized Constructor 
    length = l; 
    width = w; 
    } 
    int Area(){ 
    return length*width; 
    } 
    } 
    public class Main{ 
    public static void main(String args[]){ 
    Rectangle R1 = new Rectangle(); 
    Rectangle R2 = new Rectangle(20, 20); 
    Rectangle R3 = new Rectangle(); 
    R3.length = 30; 
    R3.width = 30; 
    System.out.println("Rect Area of No Arg Constructor :" + R1.Area()); 
    System.out.println("Rect Area of Parameterized Constructor :" + R2.Area()); 
    System.out.println("Rect Area of Default Constructor :" + R3.Area()); 
    } 
    }