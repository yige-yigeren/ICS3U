package Lesson17;

public class doctorMain {
    public static void main(String[] args) {

        doctor a = new doctor("Dr. Smith", "Family", 100000);

        doctor b = new doctor("Dr. Jones");

        doctor c = new doctor("Dr. Brown", "Surgeon", 20000);

        c.addp("John");
        c.addp("Mary");

        a.print();

        c.raise(10);
        c.print();



    }
}
