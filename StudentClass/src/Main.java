import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student asdf = new Student("Asdf");
        System.out.println(asdf);

        Courses course1 = new Courses("English", 11);
        asdf.addCourses(course1);

        Courses course2 = new Courses("Math", 54);
        asdf.addCourses(course2);
        Courses course3 = new Courses("French", 88);
        asdf.addCourses(course3);
        Courses course4 = new Courses("Chemistry", 35);
        asdf.addCourses(course4);
        Courses course5 = new Courses("Biology", 78);
        asdf.addCourses(course5);
        Courses course6 = new Courses("Physics", 99);
        asdf.addCourses(course6);
        Courses course7 = new Courses("Geography", 66);
        asdf.addCourses(course7);
        Courses course8 = new Courses("History", 76);
        asdf.addCourses(course8);

        System.out.println(Arrays.toString(asdf.course));
        System.out.println("Average grade of all classes is " + course8.getGradeAverage());
    }
}