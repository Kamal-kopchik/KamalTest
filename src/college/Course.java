package college;

public class Course {
    private String courseName;
    private String teacher;
    private String classroom;

    public Course(String courseName, String teacher, String classroom) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.classroom = classroom;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
