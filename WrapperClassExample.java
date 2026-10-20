import java.util.ArrayList;

// Concept 3: Wrapper Classes, Autoboxing and Unboxing
// Wrapper classes (Integer, Double, Character, Boolean...) turn primitive
// values into objects, so they can be used in collections and have methods.
public class WrapperClassExample {
    public static void main(String[] args) {
        // Autoboxing: primitive -> object automatically
        int a = 25;
        Integer boxed = a;
        System.out.println("Autoboxed Integer: " + boxed);

        // Unboxing: object -> primitive automatically
        Integer b = 40;
        int unboxed = b;
        System.out.println("Unboxed int: " + unboxed);

        // Converting text to numbers (useful when input comes as a String)
        String priceText = "149.75";
        String qtyText = "3";
        double price = Double.parseDouble(priceText);
        int qty = Integer.parseInt(qtyText);
        System.out.println("Total bill: " + (price * qty));

        // Useful methods and constants of wrapper classes
        System.out.println("Max int value: " + Integer.MAX_VALUE);
        System.out.println("Min int value: " + Integer.MIN_VALUE);
        System.out.println("25 in binary: " + Integer.toBinaryString(25));
        System.out.println("Is '7' a digit? " + Character.isDigit('7'));
        System.out.println("Uppercase of 'j': " + Character.toUpperCase('j'));
        System.out.println("Boolean from text \"true\": " + Boolean.parseBoolean("true"));

        // Collections can only store objects, so autoboxing happens here
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(70);   // int 70 is boxed into Integer
        marks.add(85);
        marks.add(92);
        int sum = 0;
        for (Integer m : marks) {
            sum += m;    // Integer is unboxed into int
        }
        System.out.println("Marks: " + marks + ", Sum: " + sum);

        // Comparing wrapper objects: use equals(), not ==
        Integer x = 1000;
        Integer y = 1000;
        System.out.println("x == y : " + (x == y));
        System.out.println("x.equals(y) : " + x.equals(y));
    }
}
