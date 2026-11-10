import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String aa=in.next();
        Department heart = new Department(1,aa);
        Doctor doctor1 = new Doctor(11228,"Rami Mohamed",25,"780855691","tird",-2500,heart);
        heart.addDoctor(doctor1);
        System.out.println("DEPARTMENT INFORMATION");
        heart.displayDoctor();
        Doctor result= heart.searchDoctor(11228);
        if (result!=null){
            result.displayInfo();
        } else {
            System.out.println("not found");
        }
        Employee employee= new Employee(12345,"salh",20,"778539654","nurse",1000);
        System.out.println("EMPLOYEE INFORMATION:");
        employee.displayInfo();
        employee.setSalary(1500);
        System.out.println("========");
        employee.getSalary();
        heart.removeDoctor(11228);
        heart.displayDepartment();

    }
}
