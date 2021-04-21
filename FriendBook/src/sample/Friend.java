package sample;

public class Friend {

    private  String Age;
    private  String firstName;
    private  String lastName;

    public Friend(String age, String firstName, String lastName) {
        this.Age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAge() {
        return Age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String toString() {
        return firstName;
    }
}
