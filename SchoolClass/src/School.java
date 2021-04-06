import java.util.ArrayList;


public class School {// school class, holds arrays
    private int schoolNum;
    private String schoolName;
    private int totalStudents;

    ArrayList<Teacher> teachersList = new ArrayList<>();
    ArrayList<Student> studentsList = new ArrayList<>();

    School(String schoolName, int schoolNum, int totalStudents) {//fields for school details
        this.schoolName = schoolName;
        this.schoolNum = schoolNum;
        this.totalStudents = totalStudents;
    }

    public void add(Teacher teacher){
        teachersList.add(teacher);
    }

    public void add(Student student){
        studentsList.add(student);
    }

    public void delete(Teacher teacher){//removes a teacher from list
        teachersList.remove(teacher);
    }

    public void delete(Student student){//removes a student from list
        studentsList.remove(student);
    }


    public int getSchoolNum() {
        return schoolNum;
    }

    public void setSchoolNum(int schoolNum) {
        this.schoolNum = schoolNum;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public String toString() {// prints out array
        return "Name: " + schoolName + " School #" + schoolNum + " Total Students: " + totalStudents;
    }
}
