import java.util.ArrayList;

public class Department {
    private int departmentId;
    private String departmentName;
    private ArrayList<Doctor> doctors;

    public Department(int departmentId, String departmentName){
        this.departmentId=departmentId;
        this.departmentName=departmentName;
        doctors = new ArrayList<Doctor>();
    }
    public int getDepartmentId(){
        return departmentId;
    }
    public void setDepartmentId(int departmentId){
        this.departmentId=departmentId;
    }
    public String getDepartmentName(){
        return departmentName;
    }
    public void setDepartmentName(String departmentName){
        this.departmentName=departmentName;
    }
    public void addDoctor(Doctor doctor){
        if (doctor == null){
            System.out.print("Doctor is not valid");
            return;
        }
        if (searchDoctor(doctor.getId()) != null){
            System.out.print("Doctor already exists in this department");
            return;
        }
        doctors.add(doctor);
        doctor.setDepartment(this);
        System.out.println("Doctor add successfully");
    }
    public Doctor searchDoctor(int doctorId){
        for(int i=0 ; i<doctors.size(); i++){
            if (doctors.get(i).getId()==doctorId){
                return doctors.get(i);
            }
        }
        return null;
    }
    public void removeDoctor(int doctorId){
        Doctor doctor= searchDoctor(doctorId);
        if (doctor != null){
            doctors.remove(doctor);
            doctor.setDepartment(null);
            System.out.println("Doctor removed successfully");
        }else {
            System.out.println("Doctor not found");
        }
    }
    public void displayDoctor(){
        if (doctors.isEmpty()){
            System.out.println("ther are no doctor in this department.");
            return;
        }
        else {
            for (int i = 0; i < doctors.size(); i++) {
                doctors.get(i).displayInfo();
                System.out.println("==================================");
            }
        }
    }
    public void displayDepartment(){
        System.out.println("Department ID:" + departmentId);
        System.out.println("Department Name:"+ departmentName);
        System.out.println("Number of doctors:"+doctors.size());
        displayDoctor();
    }
}
