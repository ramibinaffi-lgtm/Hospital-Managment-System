public class Employee extends Person{
    private String jobTitle;
    private float salary;

    public Employee(int id , String name, int age , int phone, String jobTitle ,String address, float salary){
        super(id , name, age, phone,address);
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }

    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }

    @Override
    public void display() {
        System.out.println("-------Employee-------");
        System.out.println("🆔 Employee ID:"+getId());
        System.out.println("📌 Name:"+getName());
        System.out.println("📌 Age:"+getAge());
        System.out.println("📞 Phone:"+getPhone());
        System.out.println("🏡 Address:"+getAddress());
        System.out.println("📜 jop Title:"+getJobTitle());
        System.out.println("💸 Salary:"+getSalary());
    }
}
