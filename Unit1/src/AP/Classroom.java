package AP;

public class Classroom {
    private String teacherName;
    private Student[] students;

    public Classroom(String teacherName, Student[] students) {
        this.teacherName = teacherName;
        this.students = students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String findStudent(int studentID) {
        int left = 0;
        int right = students.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (students[mid].getStudentID() == studentID) {
                return students[mid].getStudentName();
            } else if (students[mid].getStudentID() < studentID) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return "Student Not Found";
    }
}
