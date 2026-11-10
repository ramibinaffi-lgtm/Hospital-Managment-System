import java.util.Scanner;

public class Doctor extends Person {
    private String specialization;
    private double salary;
    private Department department;

    public Doctor(int id,String name,int age, String phone , String specialization, double salary, Department department){
        super(id , name , age, phone);
        this.specialization = specialization;
        setSalary(salary);
        this.department = department;
    }
    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        while(true) {


            if (salary > 0){
                this.salary = salary;
             break;}
            else
            {
                Scanner in = new Scanner(System.in);
                System.out.println("error the number is nigtive please enter again");
                salary = in.nextDouble();


            }
        }
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department){
        this.department = department;
    }
    @Override
    public void displayInfo(){
        System.out.println("Doctor ID:" + getId());
        System.out.println("NAME:"+ getName());
        System.out.println("Age:" + getAge());
        System.out.println("Phone:"+ getPhone());
        System.out.println("Specialization:" + getSpecialization());
        System.out.println("Salary:" + getSalary());
        if (department == null){
            System.out.println("Department : Not Assigned");
        } else {
            System.out.println("Department:"+ department.getDepartmentName());
        }
    }
}
