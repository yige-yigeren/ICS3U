package Lesson14;

public class studentMain {
    public static void main(String[] args) {

        student a = new student("Name", 16, "School");

        a.addCourse("MCR3U", 78);
        a.addCourse("ENG3U", 87);
        a.addCourse("MHF4U", 92);
        a.addCourse("ICS4U", 85);
        a.addCourse("BBB4M", 85);
        a.addCourse("ENG4U", 85);
        a.addCourse("CIA4U", 85);
        a.addCourse("CIN4U", 85);
        a.addCourse("HIS4U", 85);

        a.printCourses();

        System.out.println(a.university(85));

    }
}
