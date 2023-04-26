package Lesson2;

import java.math.*;

public class operations {
    public static void main(String[] args) {

        int a = 10;
        int b = 4;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((double)a / b);  //casting
        System.out.println(a % b);  //module (mod)
        System.out.println(a^b);


        String first = "max";
        String last = "Li";
        System.out.println(first + last);

        System.out.println(Math.pow(a, b));
        System.out.println(Math.log(b));


        System.out.println((int)(Math.random()*121));   //random number between 0 and 120    

        char c = 'D';
        char d = 'f';
        System.out.println(c);
        System.out.println((char)68);
        System.out.println(c + d); 
    
    
    
    
    }
}
