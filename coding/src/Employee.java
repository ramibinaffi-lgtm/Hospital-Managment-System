public class Employee extends Person{
    private String jobTitle;
    private double salary;

    public Employee(int id , String name, int age , String phone, String jobTitle, double salary){
        super(id , name, age, phone);
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee ID:"+getId());
        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Phone:"+getPhone());
        System.out.println("jop Title:"+getJobTitle());
        System.out.println("Salary:"+getSalary());
    }
}
