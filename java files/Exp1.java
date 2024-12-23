// Different Types of Variables Example

public class Exp1 {
    int my_variable = 20; // Instance Variable
    static int data = 30; // Static Variable

    public static void main(String args[]) {
        int my_variable = 50; // Local Variable
        int localvalue = 80; // Local Variable

        // Create an object to access the instance variable
        Exp1 obj = new Exp1();

        // Accessing variables
        System.out.println("Value of Instance Variable: " + obj.my_variable);
        System.out.println("Value of Static Variable: " + Exp1.data);
        System.out.println("Value of Local Variable: " + localvalue);
    }
}
