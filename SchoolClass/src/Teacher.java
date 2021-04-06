public class Teacher {//teacher class, holds info on teachers
    private String firstName;
    private String lastName;
    private String Subject;
    private String Name;

    Teacher(String firstName, String lastName, String Subject){//teacher constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.Name = firstName + " " + lastName;
        this.Subject = Subject;

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

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public String toString(){
    return Name + ": " + Subject;
    }
}
