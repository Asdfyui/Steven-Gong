public class Student {
    String firstName;
    static int idNum = 1;
    private int id;
    Student(){
        firstName = "";
        id = idNum;
        idNum++;
    }
    Courses[] course;
    //Courses[] returnVal;

    public int index= 0;
    Student(String firstName){
        this.id = idNum;
        idNum++;
        this.firstName = firstName;
        course = new Courses[8];

    }
    //private Courses[] addItem(Courses courses){
    //  Courses[] returnVal = new Courses [course.length + 1];
    //for (int i = 0; i < course.length; i++){
    //  returnVal[i] = course[i];
    ///returnVal[course.length] = courses;
    //}
    //return returnVal;
    //}

    public void addCourses(Courses courses){
        if (index < 8){
            course[index] = courses;
            index++;
        }
    }


    public String toString (){
        return "First Name: " + firstName + " Id: " + id;
    }
}