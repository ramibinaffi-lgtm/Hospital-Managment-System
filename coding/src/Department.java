import java.util.ArrayList;

public class Department {
    private int departmentId;
    private String departmentName;
     ArrayList<Doctor> doctors;

    public Department(int departmentId, String departmentName){
        this.departmentId=departmentId;
        this.departmentName=departmentName;
        this.doctors=new ArrayList<>();
    }
    public int getDepartmentId(){
        return departmentId;
    }
    public void setDepartmentId(int departmentId){
        if (departmentId<0)
            System.out.println("pleas enter the number");
        else
            this.departmentId=departmentId;
    }
    public String getDepartmentName(){
        return departmentName;
    }
    public void setDepartmentName(String departmentName){
        if (departmentName == null)
            System.out.println("pleas enter the raight name");
        else this.departmentName=departmentName;
    }


    public void addDoctor(Doctor doctor){

        doctors.add(doctor);

        System.out.println("Doctor add successfully ✅");
    }
    public Doctor searchDoctor(int doctorId){
        for (Doctor doctor: doctors){
            if (doctor.getId()==doctorId) {
                return doctor;
            }
        }return null;
    }

    public boolean removeDoctor(int doctorId){
        Doctor doctor= searchDoctor(doctorId);
        if (doctor != null){
            doctors.remove(doctor);
            doctor.setDepartment(null);

            System.out.println("Doctor removed successfully ✅");
            return true;
        }else {
            System.out.println("Doctor not found ❌");return false;
        }
    }
    public void displayDoctor(){
        if (doctors.isEmpty()){
            System.out.println("There are no doctor in this department.❕");

        }
        else {
            for (int i = 0; i < doctors.size(); i++) {
                doctors.get(i).display();
                System.out.println("==================================");
            }
        }
    }
    public void displayDepartment(){
        System.out.println("🆔 Department ID:" + departmentId);
        System.out.println("📌 Department Name:"+ departmentName);
        System.out.println("🔢 Number of doctors:"+doctors.size());
        displayDoctor();
    }
}
