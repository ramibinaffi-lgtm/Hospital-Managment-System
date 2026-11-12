import java.util.Scanner;

public class Main {
    Hospital    hospital=new Hospital("SAKRAN HOSPITAL");

    Scanner in =new Scanner(System.in);
    int choice;
    static Main aa=new Main();
    public static void main (String[] args) {
        aa.DisplayMenu();


    }
      //🥼🥼💉💉💉🩺💊🧬🧬🩸🩸📱📱📞📞🪪🪪📑📑📰📰📃📃💸💸📌📌
       void DisplayMenu() {
        do {
            System.out.println("\n🏥=============" + hospital.NameOfHospital + "=============🏥");
            System.out.println("1. Patient Management");
            System.out.println("2. Doctor Management");
            System.out.println("3. Employee Management");
            System.out.println("4. Department Management");
            System.out.println("5. Bill Management");
            System.out.println("6. Hospital Information");
            System.out.println("10. Exit");
            choice = in.nextByte();
            switch (choice) {

                case 1:
                    PatientMenu();
                    break;
                case 2:
                    DoctorMenu();
                    break;
                case 3:
                    EmployeeMenu();
                    break;
                case 4:
                    DepartmentMenu();
                    break;
                case 5:
                    BillMenu();break;
                case 6:HospitalInformation();break;

            }
        }while (choice!=10);
      }


     void PatientMenu(){
        do {
            System.out.println("----------Patient Management----------");
            System.out.println("1. Add Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Display All Patient");
            System.out.println("4. Update Patient Information");
            System.out.println("5. Add Medical Record");
            System.out.println("6. Display Patient's Medical Record");
            System.out.println("0. To Back");
            System.out.print("Enter Your Choice: ");
            choice = in.nextInt();
            int id ,age ,phone;
            String name ,bloodtype ,address;


            switch (choice){

                case 1:
                    System.out.println("----------Add Patient----------");

                    System.out.println("Enter patient name 📌 :"); name =in.next();
                    System.out.println("Enter patient id 🆔 :"); id =in.nextInt();
                    if (hospital.IsPatientFound(id)==true)
                        while (hospital.IsPatientFound(id)==true){
                            System.out.println("The id is already exist:");

                            System.out.println("Enter patient id again  :"); id =in.nextInt();

                        }
                    System.out.println("Enter patient age 📌 :"); age =in.nextInt();
                    System.out.println("Enter patient phone 📞 :"); phone =in.nextInt();
                    System.out.println("Enter patient address 🏡 :"); address =in.next();
                    System.out.println("Enter patient type of blood 🩸 :"); bloodtype =in.next();
                    Patient patient=new Patient(name,id,phone,age,bloodtype,address);//تهيئه افتراضيه بدائيه
                    boolean blood=patient.setBloodType(bloodtype);
                    while (blood==false) {
                        System.out.println("Enter again patient's type of blood (A+,A-,B+,B-,O+,O-,AB+,AB-) 🩸 : ");
                        bloodtype = in.next();
                        blood=patient.setBloodType(bloodtype);
                    }
                        patient=new Patient(name,id,phone,age,bloodtype,address);
                    hospital.AddPatient(patient); break;
                case 2:
                    System.out.println("Enter patient id who you want to search 🔍 :");id =in.nextInt();
                    if(hospital.IsPatientFound(id)!=true)
                        System.out.println("The patient is not found ❌");
                    else hospital.SearchPatient(id); break;
                case 3:
                    hospital.DisplayPatients(); break;
                case 4:
                    System.out.println("Enter patient id who you want to search 🔍 :");id =in.nextInt();
                    if(hospital.IsPatientFound(id)!=true)
                        System.out.println("The patient is not found ❌");
                    else hospital.updatePatientlnfo(id);break;


                case 5:
                        System.out.println("Enter patient id who you want to add record to hem 📰 :");id =in.nextInt();
                        if(hospital.IsPatientFound(id)!=true)
                             System.out.println("The patient is not found ❌");
                        else hospital.AddMedicalRecord(id);break;
                case 6:
                        hospital.DisplayAllRecords();break;




            }


        }while (choice!=0);
    }
     void DoctorMenu(){
        do {
            System.out.println("----------Doctor Management----------");
            System.out.println("1. Add Doctor");
            System.out.println("2. Search Doctor");
            System.out.println("3. Display All Doctor");
            System.out.println("0. To Back");
            System.out.print("Enter Your Choice: ");
            choice = in.nextInt();
            int id, age, phone,departmentId;
            String name, specialization, address,departmentName;
            float salary;

            switch (choice){
                case 1:
                    System.out.println("----------Add Doctor----------");
                    System.out.println("Enter department id that you want doctor for it 🔢 :");
                    departmentId =in.nextInt();
                    if (hospital.IsIdDepartmentFound(departmentId)==true) {
                        System.out.println("Enter doctor name 📌 :");
                        name = in.next();
                        System.out.println("Enter doctor id 🆔 :");
                        id = in.nextInt();
                        if (hospital.IsIdDoctorFound(id) == true)
                            while (hospital.IsIdDoctorFound(id) == true) {
                                System.out.println("The id is already exist 👀");

                                System.out.println("Enter doctor id again 🔁 :");
                                id = in.nextInt();

                            }
                        System.out.println("Enter doctor age 📌 :");
                        age = in.nextInt();
                        System.out.println("Enter doctor phone 📞 :");
                        phone = in.nextInt();
                        System.out.println("Enter doctor address 🏡 :");
                        address = in.next();
                        System.out.println("Enter doctor salary 💸 :");
                        salary = in.nextFloat();
                        if (salary<0)
                            while (salary<0){
                                System.out.println("Salary is not valitaet ❌");
                                System.out.println("Enter employee salary again 🔁💸 :");
                                salary = in.nextFloat();
                            }
                        System.out.println("Enter doctor specialization 🥼 :");
                        specialization = in.next();
                        Doctor doctor = new Doctor(id, name, age, phone, specialization, salary, address);
                        hospital.AddDoctor(doctor,departmentId);break;
                    }else System.out.println("The department is not found ❌");break;
                case 2:
                    System.out.println("Enter doctor id who you want to search 🔍 :");id =in.nextInt();
                   Doctor doctor= hospital.searchDoctor(id);
                    if(doctor!=null)
                        System.out.println("The doctor is not found ❌");
                    else doctor.display();break;
                case 3:
                    hospital.DisplayAllDoctors();break;


            }

        }while (choice!=0);
    }
     void EmployeeMenu() {
        do{
         System.out.println("----------Employee Management----------");
         System.out.println("1. Add Employee");
         System.out.println("2. Search Employee");
         System.out.println("3. Display Employees");
         System.out.println("0. To Back");
         System.out.print("Enter Your Choice: ");
         choice = in.nextInt();
         int id, age, phone, departmentId;
         String name, jobTitle, address, departmentName;
         float salary;
         Department department;
         switch (choice) {
             case 1:
                 System.out.println("----------Add Employee----------");
                 System.out.println("Enter employee name 📌 :");
                 name = in.next();
                 System.out.println("Enter employee id 🆔 :");
                 id = in.nextInt();
                 if (hospital.IsIdEmployeeFound(id) == true)
                     while (hospital.IsIdEmployeeFound(id) == true) {
                         System.out.println("The id is already exist👀");

                         System.out.println("Enter employee id again 🔁:");
                         id = in.nextInt();

                     }
                 System.out.println("Enter employee age 📌 :");
                 age = in.nextInt();
                 System.out.println("Enter employee phone 📞 :");
                 phone = in.nextInt();
                 System.out.println("Enter employee address 🏡 :");
                 address = in.next();
                 System.out.println("Enter employee salary 💸 :");
                 salary = in.nextFloat();
                 if (salary<0)
                     while (salary<0){
                         System.out.println("Salary is not valitaet ❌");
                         System.out.println("Enter employee salary again 🔁💸 :");
                         salary = in.nextFloat();
                      }
                 System.out.println("Enter employee jobTitle  ✒️️ :");
                 jobTitle = in.next();
                 Employee employee = new Employee(id, name, age, phone, jobTitle, address, salary);
                 hospital.AddEmployee(employee);
                 break;
             case 2:
                 System.out.println("Enter employee id who you want to search 🔍 :");
                 id = in.nextInt();
                 if (hospital.IsIdEmployeeFound(id) != true)
                     System.out.println("The doctor is not found ❌");
                 else hospital.SearchEmployee(id);
                 break;
             case 3:
                 hospital.DisplayAllEmployee();
                 break;
             }
         }while (choice!=0);
     }
     void DepartmentMenu(){
        do {
            System.out.println("----------Department Management----------");
            System.out.println("1. Add Department");
            System.out.println("2. Display Departments");
            System.out.println("3. Display Doctors in a Department");
            System.out.println("4. Remove Doctor From a Department");
            System.out.println("0. To Back");
            System.out.print("Enter Your Choice: ");
            choice = in.nextInt();
            int departmentId,idDoctor;
            String departmentName;
            switch (choice){
                case 1:
                    System.out.println("----------Add Department----------");
                    System.out.println("Enter department name 📌 :");
                    departmentName = in.next();
                    System.out.println("Enter department id 🆔 :");
                    departmentId = in.nextInt();
                    if (hospital.IsIdDepartmentFound(departmentId) == true)
                        while (hospital.IsIdDepartmentFound(departmentId) == true) {
                            System.out.println("The id is already exist 👀");

                            System.out.println("Enter department id again 🔁 :");
                            departmentId = in.nextInt();

                        }
                    Department department=new Department(departmentId , departmentName);
                    hospital.AddDepartment(department); break;
                case 2:
                    hospital.DisplayAllDepartment(); break;
                case 3:
                    System.out.println("Enter department id which you want to display it doctors 🔍 :");
                    departmentId = in.nextInt();
                    if (hospital.IsIdDepartmentFound(departmentId) != true)
                        System.out.println("The department is not found ❌");
                    else hospital.DisplayDoctorInDepartment(departmentId); break;
                case 4:
                    System.out.println("Enter doctor id who you want to remove him from him department 🔍 :");
                    idDoctor = in.nextInt();
                    if (hospital.IsIdDoctorFound(idDoctor) != true)
                        System.out.println("The department is not found ❌");
                    else hospital.RemoveDoctorFromDepartment(idDoctor); break;





            }

        }while (choice!=0);
    }
    void BillMenu() {

        do {
            System.out.println("----------Bill Management----------");
            System.out.println("1. Create Bill");
            System.out.println("1. Display All Bills");
            System.out.println("3. Search and Display Bill");
            System.out.println("4. Mark Bill as Paid");
            System.out.println("5. Update Bill ");
            System.out.println("0. To Back");
            System.out.print("Enter Your Choice: ");
            choice = in.nextInt();
            int num,id;
            float con;
            float trat;

            switch (choice) {

                case 1:
                    System.out.println("----------Add Bill----------");
                    System.out.println("Enter patient id who you want to add bill for him 🔍 :");id =in.nextInt();
                    if(hospital.IsPatientFound(id)!=true)
                        System.out.println("The patient is not found ❌");
                    else{
                    System.out.print("Enter number of bill 🔢 : ");num= in.nextInt();
                    System.out.print("Enter Consultation Fee 💵 : ");con= in.nextFloat();
                    System.out.print("Enter Treatment Fee: 💵 ");trat= in.nextFloat();
                    Bill bill = new Bill(num,con,trat);
                    hospital.AddBill(bill,id);
                    }
                    break;

                case 2:
                    hospital.PrintAllBill();break;
                case 3:
                    System.out.println("Enter patient id who you want to search bill him 🔍 :");id =in.nextInt();
                    if(hospital.IsPatientFound(id)!=true)
                        System.out.println("The patient is not found ❌");
                    else
                       hospital.SearchBill(id);break;
                case 4:
                    System.out.println("Enter patient number which you want to paid his bill 🔍 :");
                    num = in.nextInt();
                    if (hospital.IsPatientFound(num) != true)
                        System.out.println("The patient is not found ❌");
                    else hospital.BillIsPaid(num); break;
                case 5:
                    System.out.println("Enter bill number which you want to update it 🔍 :");
                    num = in.nextInt();
                    if (hospital.IsPatientFound(num) != true)
                        System.out.println("The patient is not found ❌");
                    else {
                        System.out.println("Please enter new fee of consultation: 💵 ");
                        con = in.nextFloat();
                        System.out.println("Please enter new fee of treatment: 💵 ");
                        trat = in.nextFloat();
                        hospital.UpdateBill(num,con,trat); break;

                    }
            }
        } while (choice != 0);


    }
    void HospitalInformation(){
        hospital.HospitalInfo();
    }

    }

