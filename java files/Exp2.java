// Autoboxing and Unboxing Example

public class Exp2 { // Class name matches file name
    public static void main(String[] args) {
        int a1 = 50;
        Integer a2 = a1; // Autoboxing
        Integer a3 = 5;  // Autoboxing directly
        Integer i = 55;  // Autoboxing directly
        int a4 = i;      // Unboxing
        
        System.out.println("Autoboxing values: " + a2 + " " + a3);
        System.out.println("Unboxing Value: " + a4);
    }
}
