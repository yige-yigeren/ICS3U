package AP;

public class School {
    private Classroom[] classrooms;

    public School(Classroom[] classrooms) {
        this.classrooms = classrooms;
    }

    public String findStudent(String teacherName, int studentID) {
        for (Classroom classroom : classrooms) {
            if (classroom.getTeacherName().equals(teacherName)) {
                return classroom.findStudent(studentID);
            }
        }
        return "Student Not Found";
    }
}
