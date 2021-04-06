public class Employee {
    private String firstName;
    private String lastName;
    public String Name;
    static int Idnum = 1;
    private int id;
    private int salary;
    private int annualSalary;
    Employee(){
        firstName = "a";
        lastName = "b";
        Name = firstName + lastName;
        id = 1;
        salary = 0;
        annualSalary = 0;

    }
    Employee(int id, String firstName, String lastName, int salary ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.Name = this.firstName + this.lastName;
        this.id = id;
        this.salary = salary;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        Name = name;

    }

    public String getName() {
        return Name;
    }

    public int AnnualSalary(){
        annualSalary = salary * 12;
        return annualSalary;
    }


    public void setSalary(){
    }


    public int raiseSalary(double percent){

        this.salary = (int) (salary * percent);
        return salary;

    }

    public String toString() {
        return "Name: " + Name + " Id: " + id + " Salary: " + salary;
    }
}

