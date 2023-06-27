package AP;

public class Schoolmain {
    public static void main(String[] args) {
        // Create some test data
        Student[] students1 = {
            new Student("Alice", 1),
            new Student("Bob", 2),
            new Student("Charlie", 3)
        };
        Classroom classroom1 = new Classroom("Ms. Smith", students1);

        Student[] students2 = {
            new Student("David", 4),
            new Student("Emily", 5),
            new Student("Frank", 6)
        };
        Classroom classroom2 = new Classroom("Mr. Johnson", students2);

        Classroom[] classrooms = {classroom1, classroom2};
        School school = new School(classrooms);

        // Test the findStudent method
        System.out.println(school.findStudent("Ms. Smith", 1)); 
        System.out.println(school.findStudent("Mr. Johnson", 5)); 
        System.out.println(school.findStudent("Ms. Smith", 4)); 
        System.out.println(school.findStudent("Mr. Johnsn", 2)); 
    }
}
