package AP;

public class Student {
    private String studentName;
    private int studentID;

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }
}