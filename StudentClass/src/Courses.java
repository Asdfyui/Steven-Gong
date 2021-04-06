public class Courses {
    Student student;
    private String subjectName;
    public int studentGrade;
    private int averageGrade;
    static int gradeSum = 0;
    static int courseCount = 0;

    Courses() {
        subjectName = "";
        studentGrade = 0;

    }

    Courses(String subjectName, int studentGrade) {
        this.subjectName = subjectName;
        this.studentGrade = studentGrade;
        gradeSum = this.studentGrade + gradeSum;
        courseCount++;
    }

    public String toString() {
        return this.subjectName;
    }

    public int getStudentGrade() {
        return this.studentGrade;
    }

    private void getGrades() {
        averageGrade = getStudentGrade();
    }

    public int getGradeAverage() {
        return gradeSum/courseCount;
    }
}
