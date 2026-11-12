import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    Scanner in=new Scanner(System.in);
    static String NameOfHospital;
    private ArrayList<Patient>patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Employee>employees;
    private ArrayList<Department>departments;

    public Hospital(String NameOfHospital){

        this.NameOfHospital=NameOfHospital;
        patients=new ArrayList<>();
        doctors=new ArrayList<>();
        employees=new ArrayList<>();
        departments=new ArrayList<>();
    }


    void AddPatient(Patient patient){
        patients.add(patient);
        System.out.println("Patient add successfully ✅");
    }

    boolean IsPatientFound(int ID){
        for (Patient patient:patients){
            if (patient.getId()==ID){
                return true;
            }
        }return false;

    }

    void DisplayPatients(){
        for(Patient patient:patients){
            System.out.println("----------PATIENT----------");
            System.out.println("📌 Name of patient :"+patient.getName());
            System.out.println("🆔 ID of patient :"+patient.getId());
            System.out.println("📌 Age of patient :"+patient.getAge());
            System.out.println("📞 Phone of patient :"+patient.getPhone());
            System.out.println("🏡 Address of patient :"+patient.getAddress());
            System.out.println("🩸 Blood type of patient :"+patient.getBloodType());
        }

    }
    void SearchPatient(int ID){
        for (Patient patient:patients){
            if (patient.getId()==ID){
                /*System.out.println("--------HE IS FOUND--------");
                System.out.println("📌 Name of patient :"+patient.getName());
                System.out.println("🆔 ID of patient :"+patient.getId());
                System.out.println("📌 Age of patient :"+patient.getAge());
                System.out.println("📞 Phone of patient :"+patient.getPhone());
                System.out.println("🏡 Address of patient :"+patient.getAddress());
                System.out.println("🩸 Blood type of patient :"+patient.getBloodType());
*/              patient.display();
                break;
            }

        }

    }
   void AddMedicalRecord(int id){
        for (Patient patient:patients){
            if (patient.getId()==id){
                int recorded;
                String Diagnosis,Treatment,RecordData;
                System.out.println("---------ADD RECORD---------");
                System.out.println("Enter number of recoded 🔢 :");recorded= in.nextInt();
                System.out.println("Diagnosis 🩺 :");Diagnosis=in.next();
                System.out.println("Treatment 💊 :");Treatment=in.next();
                System.out.println("Enter Record Data 📅 :");RecordData=in.next();
                MedicalRecord medicalRecord=new MedicalRecord(recorded,Diagnosis,Treatment,RecordData);
                patient.setMedicalRecordedical(medicalRecord);
                break;
            }
        }


   }
   void DisplayAllRecords(){
        for (Patient patient:patients){
            patient.display();


        }

   }
   void updatePatientlnfo(int ID){
        for(Patient patient:patients){
            if (patient.getId()==ID){
                if(patient.getMedicalRecordedical()!=null){
                    int recorded;
                    String Diagnosis,Treatment,RecordData;
                    System.out.println("-------UPDATE RECORD-------");
                    System.out.println("Enter new number of recoded 🔢 :");recorded= in.nextInt();
                    System.out.println("Enter new Diagnosis 🩺 :");Diagnosis=in.next();
                    System.out.println("Enter new Treatment 💊 :");Treatment=in.next();
                    System.out.println("Enter new Record Data 📅 :");RecordData=in.next();
                    patient.updatePatientlnfo(Diagnosis,Treatment,RecordData,recorded);

                }
            }
        }

   }
   boolean IsIdDoctorFound(int id){
       for (Doctor doctor:doctors){
           if (doctor.getId()==id){

               return true;
           }
       }   return false;
   }

   Department searchDepartment(int id){
        for (Department department:departments){
            if (department.getDepartmentId()== id )return department;
        }return null;

   }
    public void AddDoctor(Doctor doctor ,int id){
          Department department = searchDepartment(id);
          if (department!=null)
          department.AddDoctor(doctor);
    }
    public Doctor searchDoctor(int doctorId){
        for (Department department: departments){
            Doctor doctor =department.searchDoctor(doctorId);
            if (doctor!=null)
                return doctor;
        }return null;
    }

    void DisplayAllDoctors(){
        for (Doctor doctor:doctors){
            doctor.display();
        }

    }
    boolean IsIdEmployeeFound(int id){
        for (Employee employee:employees){
            if (employee.getId()==id){

                return true;
            }
        }   return false;
    }
    void AddEmployee(Employee employee){
        employees.add(employee);
        System.out.println("Employee add successfully ✅");
    }
    void SearchEmployee(int id){
        for (Employee employee:employees){
            if (employee.getId()==id){
                employee.display();
            }

        }

    }
    void DisplayAllEmployee(){
        for (Employee employee:employees){
            employee.display();
        }

    }
    boolean IsIdDepartmentFound(int id){
        for (Department department:departments){
            if (department.getDepartmentId()==id){

                return true;
            }
        }   return false;
    }
    void AddDepartment(Department department){
        departments.add(department);
        System.out.println("Department add successfully ✅");
    }
    void DisplayAllDepartment(){
        for (Department department:departments){
            department.displayDepartment();
        }
    }
    void DisplayDoctorInDepartment(int id){
        for (Department department:departments){
            if (department.getDepartmentId()==id){
                department.displayDoctor();
            }
        }

    }
    void RemoveDoctorFromDepartment(int idDoctor ){
            for (Department department:departments){
                if (department.removeDoctor(idDoctor)==true)
                    return;

            }
    }
    /*boolean IsBillFound(int id){
        for (Bill bill:bills){
            if (bill.getNamberOfBill()==num){
                return true;
            }
        }return false;

    }*/
    void AddBill(Bill bill,int idPatient){
        for (Patient patient:patients){
            if (patient.getId()==idPatient){
                patient.setBill(bill);
            }
        }
    }
    void SearchBill(int id){
        for (Patient patient:patients){
            if (patient.getId()==id){
                patient.PrintBill();
                return;
            }
        }
    }
    void PrintAllBill(){
        for(Patient patient:patients){
            patient.PrintBill();
        }

    }
    void BillIsPaid(int id){
        for(Patient patient:patients){
            if (patient.getId()==id)
                patient.BillIsPaid();
        }
    }
    void UpdateBill(int id , float con,float treat){
        for(Patient patient:patients){
            if (patient.getId()==id)
                patient.UpdateFees(con,treat);


        }
    }
    void HospitalInfo(){
        System.out.println(NameOfHospital);
        System.out.println("Hospital Departments");
        for (Department department:departments){
            System.out.print("|| "+department.getDepartmentName()+" ");
        }
        System.out.println("Hospital Doctors");
        for (Doctor doctor:doctors){
            System.out.println("|| "+doctor.getName()+" ");
        }
    }
}
