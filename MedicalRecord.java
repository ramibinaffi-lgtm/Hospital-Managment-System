
public class MedicalRecord {
    private int recorded; // رقم السجل
    private String Diagnosis; //التشخيص
    private String Treatment; //العلاج
    private String RecordData; // تاريخ السجل


    public MedicalRecord(int recorded, String Diagnosis, String Treatment, String RecordData)
    {
        this.recorded = recorded;
        this.Diagnosis = Diagnosis;
        this.Treatment = Treatment;
        this.RecordData = RecordData;
    }


    public int getRecordid() {
        return recorded;
    }


    public void setRecordid(int recorded) {
        this.recorded = recorded;
    }


    public String getDiagnosis() {
        return Diagnosis;
    }


    public void setDiagnosis(String diagnosis) {
        Diagnosis = diagnosis;
    }


    public String getTreatment() {
        return Treatment;
    }


    public void setTreatment(String treatment) {
        Treatment = treatment;
    }


    public String getRecordData() {
        return RecordData;
    }


    public void setRecordData(String recordData) {
        RecordData = recordData;
    }

    

    
    public void displayMidecal() 
    {
        System.out.println("🔢 Recorded: " + recorded);
        System.out.println("🩺 Diagnosis: " + Diagnosis);
        System.out.println("💊 Treatment: " + Treatment);
        System.out.println("📅 RecordData: " + RecordData);
    }
    


    
  
}
