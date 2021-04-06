public class Main {
    public static void main(String[] args) {
        Student asdf = new Student("Student", "One", 9);
        Student asdff = new Student("Student", "Two", 10);
        Student Student3 = new Student("Student", "Three", 12);
        Student Student4 = new Student("Student", "Four", 8);
        Student Student5 = new Student("Student", "Five", 7);
        Student Student6 = new Student("Student", "Six", 6);
        Student Student7 = new Student("Student", "Seven", 9);
        Student Student8 = new Student("Student", "Eight", 4);
        Student Student9 = new Student("Student", "Nine", 5);
        Student Student10 = new Student("Student", "Ten", 7);

        Teacher teacher1 = new Teacher("Science", "Teacher", "Science");
        Teacher teacher2 = new Teacher("Math", "Teacher", "Math");
        Teacher teacher3 = new Teacher("History", "Teacher", "History");

        School school = new School("school123", 4123, 1010);

        school.add(asdf);
        school.add(asdff);
        school.add(Student3);
        school.add(Student4);
        school.add(Student5);
        school.add(Student6);
        school.add(Student7);
        school.add(Student8);
        school.add(Student9);
        school.add(Student10);
        school.add(teacher1);
        school.add(teacher2);
        school.add(teacher3);

        school.setSchoolNum(1312);

        System.out.println(school);

        System.out.println(school.studentsList);
        System.out.println(school.teachersList);

        school.delete(teacher2);
        school.delete(Student6);
        school.delete(Student9);

        System.out.println(school.studentsList);
        System.out.println(school.teachersList);

    }
}
