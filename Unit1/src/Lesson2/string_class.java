package Lesson2;

public class string_class {
    public static void main(String[] args) {

        String first = "Xxxx";
        String last = "Lei";
        
        System.out.println("My name is " + last + ", " + first + ".");

        String sentense = "Today is Thursday";
        // Menthods are operations that are done on objects
        System.out.println(sentense.length());
        System.out.println(first.length());
        

        System.out.println(sentense.charAt(6));
        System.out.println(sentense.charAt(0)); // first character
        System.out.println(sentense.charAt(16)); // last character
        System.out.println(sentense.charAt(sentense.length()-1)); // last character

        System.out.println(sentense.length());
        System.out.println(sentense.substring(2, 5));

        System.out.println(first.equals("Siyu"));

        System.out.println(first.startsWith(sentense, 0));
        System.out.println(first.endsWith("u"));
        System.out.println(first.toUpperCase());

    }
}
