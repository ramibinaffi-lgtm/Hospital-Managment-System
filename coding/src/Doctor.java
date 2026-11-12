import java.util.Scanner;

public class Doctor extends Person {
    private String specialization;
    private Department department;
    private float salary;


    public Doctor(int id,String name,int age, int phone , String specialization, float salary,String address){
        super(id , name , age, phone,address);
        this.specialization = specialization;
        setSalary(salary);

    }
    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public float getSalary(){
        return salary;
    }
    public void setSalary(float salary){
        while(true) {


            if (salary > 0){
                this.salary = salary;
                break;}
            else
            {
                Scanner in = new Scanner(System.in);
                System.out.println("error the number is nigtive please enter again 🔁");
                salary = in.nextFloat();


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
    public void display(){
        System.out.println("🆔 Doctor ID:" + getId());
        System.out.println("📌 NAME:"+ getName());
        System.out.println("📌 Age:" + getAge());
        System.out.println("📞 Phone:"+ getPhone());
        System.out.println("🥼 Specialization:" + getSpecialization());
        System.out.println("💸 Salary:" + getSalary());
       /* if (department == null){
            System.out.println("Department : Not Assigned");
        } else {
            System.out.println("Department name  :"+ department.getDepartmentName());
            System.out.println("Department id  :"+ department.getDepartmentId());

        }*/
    }
}

