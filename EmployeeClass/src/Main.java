public class Main {

    public static void main(String[] args) {


        Employee steven = new Employee(1, "Steven ", "Gong", 2500);
        System.out.println(steven.getId());
        System.out.println(steven.getFirstName());
        System.out.println(steven.getLastName());
        System.out.println(steven.getName());
        System.out.println(steven.getSalary());
        System.out.println(steven.AnnualSalary());
        steven.setSalary(3000);
        System.out.println(steven.AnnualSalary());
        System.out.println(steven.raiseSalary(1.12));
        System.out.println(steven.AnnualSalary());
        System.out.println(steven);



    }
}
