public class Student {//student class, holds info on students
    private String firstName;
    private String lastName;
    private int Grade;
    static int idNum = 1;
    private int id;
    private String Name;


    Student(String firstName, String lastName, int Grade){//student constructor
        this.id = idNum;
        idNum++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Name = firstName + " " + lastName;
        this.Grade = Grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String toString(){
        return  Name + " Grade: " + Grade + " Id: " + id;
    }
}

