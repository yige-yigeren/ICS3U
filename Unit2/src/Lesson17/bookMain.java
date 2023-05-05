package Lesson17;

public class bookMain {
    public static void main(String[] args) {
            
            book a = new book("Harry Potter", "Fiction", 1000);
    
            book b = new book("Paper pig", 48, 5);
    
            book c = new book("IT", "Children", 48);

            book d = new book("Rain's Transcripts", "Horror", 1000);

            book[] library = {a, b, c, d};

            a.print();
    
            a.read(100);
    
            a.print();
 
            b.print();
 
            System.out.println("There are " + book.howMany(library, "Fiction") + " fiction books in the library.");
    }
}
