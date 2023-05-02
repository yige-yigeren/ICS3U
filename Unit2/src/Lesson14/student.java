package Lesson14;

public class student {
    

    //fields

    private String Name;
    private int Age;
    private String School;
    private String[] Courses;
    private int[] Marks;

    //constructors

    student (String n, int a, String s) {
        Name = n;
        Age = a;
        School = s;
        Courses = new String[30];
        Marks = new int[30];
    }
    void transfer (String s) {
        School = s;
    }
    void addCourse (String c, int b) {
        for (int i = 0; i < Courses.length; i++) {
            if (Courses[i] == null) {
                Courses[i] = c;
                Marks[i] = b;
                break;
            }
        }
    }
    int numCourses () {
        int count = 0;
        for (int i = 0; i < Courses.length; i++) {
            if (Courses[i] != null) {
                count++;
            }
        }
        return count;
    }
    void printCourses () {
        System.out.println("Courses taken: ");
        for (int i = 0; i < Courses.length; i++) {
            if (Courses[i] != null) {
                System.out.println(Courses[i] + ": " + Marks[i]);
            }
        }
        System.out.println();
    }
    boolean university(int cutoff) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < Courses.length; i++) {
            if (Courses[i] != null && Courses[i].charAt(3) == '4') {
                count++;
            }
        }
        if (count <6 ) {
            return false;
        } else {
            for (int i =0 ; i < Courses.length; i++) {
                if (Courses[i] != null && Courses[i].charAt(3) == '4') {
                    sum = sum + Marks[i];
                }
            }
            if ((double)sum/count >= cutoff) {
                return true;
            } else {
                return false;
            }
        }
    }
}
