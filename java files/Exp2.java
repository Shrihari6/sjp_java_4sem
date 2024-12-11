// Autoboxing and Unboxing

public class Main{
    public static void main(String []a){
    int a1 = 50;
    Integer a2 = new Integer(a1); // Boxing
    Integer a3 = 5;
    Integer i = new Integer(55);
    int a4 = i; // Unboxing
    System.out.println("autoboxing value: "+a2+" "+a3);
    System.out.println("Unboxing Value:"+a4);
    
}
}