
public class Patient extends Person {
 
    private String BloodType;
    private MedicalRecord medicalRecordedical;
    private Bill bill;
    public Patient(String Name , int Id , int NumberPhone, int Age , String Blood , String Address) {
       
        super(Id,Name,Age,NumberPhone , Address);
         setBloodType(Blood);
    }
    
     public String getBloodType() {
        return BloodType;
    }


    public Boolean setBloodType(String BloodType) {
        String[] Type = {"O+" ,"A+" , "B+", "AB+","O-" ,"A-" , "B-", "AB-"};
        
        
            for(int i =0; i < Type.length ; i++)
            {
                if(BloodType.equals(Type[i]))
                    {
                        this.BloodType = BloodType;
                        return true;
                    }
                          
            }
             return false;       
        
    }
     @Override 
     public void display()
    {
       System.out.println("-----------RECORD-----------");
       System.out.println("📌 Name is: " + getName());
       System.out.println("🆔 ID is: " + getId());
       System.out.println("📌 Age is: " + getAge());
       System.out.println("📞 Phone number is: " + getPhone());
       System.out.println("🩸 Blood type: " + getBloodType());
       System.out.println("🏡 Address is :" + getAddress());
       if (this.medicalRecordedical!=null)
            medicalRecordedical.displayMidecal();
       else
           System.out.println("❗ There are no record");
        if (this.bill!=null)
            bill.DisplayBill();
        else
            System.out.println("❗ There are no bill");
    }

    public MedicalRecord getMedicalRecordedical() {
        return medicalRecordedical;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public void setMedicalRecordedical(MedicalRecord medicalRecordedical) {
        this.medicalRecordedical = medicalRecordedical;
    }

    public void updatePatientlnfo(String Diagnosis ,String Treatment,String RecordData,int record)
    { 
      medicalRecordedical.setDiagnosis(Diagnosis);
      medicalRecordedical.setRecordData(RecordData);
      medicalRecordedical.setRecordid(record);
      medicalRecordedical.setTreatment(Treatment);
    }
    void PrintBill(){
        if (this.bill!=null){
        System.out.println("There are no bill ❗");
        System.out.println("================💷💷💷===============");
        System.out.println("🙍‍♂️ Patient  "+getName());
        bill.DisplayBill();
        }else
            System.out.println("❗ There are no bill for "+getName());
    }
    void BillIsPaid( ){
        if (this.bill!=null)
            bill.setPaid("is paid ");
        else  System.out.println("❗ There are no bill for "+getName());
    }
    void UpdateFees(float con , float treat){
        if (this.bill!=null) {
            bill.setConsultationFee(con);
            bill.setTreatmentFee(treat);
        }else  System.out.println("❗ There are no bill for "+getName());

    }
}
