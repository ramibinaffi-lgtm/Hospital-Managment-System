

public class Bill implements Payable {

    private int NamberOfBill;
    private float ConsultationFee;//رسوم الفاتوره
    private float TreatmentFee;//رسوم العلاج
    private float TotalAmount;
    private String Paid="NOT PAID";

    public Bill(int NamberOfBill,float ConsultationFee,float TreatmentFee)
    {
       this.NamberOfBill=NamberOfBill;
       this.ConsultationFee=ConsultationFee;
       this.TotalAmount=TreatmentFee;

    }

    public int getNamberOfBill() {
        return NamberOfBill;
    }

    public void setPaid(String paid) {
        Paid = paid;
    }

    public float getConsultationFee() {
        return ConsultationFee;
    }

    public void setConsultationFee(float consultationFee) {
        this.ConsultationFee = consultationFee;

    }

    public float getTreatmentFee() {
        return TreatmentFee;
    }

    public void setTreatmentFee(float treatmentFee) {
        this.TreatmentFee = treatmentFee;
    }

    public float getTotalAmount() {
        return  getConsultationFee()+getTreatmentFee();
    }


    public void DisplayBill(){
        System.out.println("================💷💷💷===============");
        System.out.println("🔢 Namber of bill :"+getNamberOfBill());
        System.out.println("💵 Fee of consultation :"+getConsultationFee());
        System.out.println("💵 Fee of treatment :"+getTreatmentFee());
        System.out.println("-------------------------------");
        System.out.println("💲 Total :"+getTotalAmount());
        System.out.println("-------------------------------");

    }

    public void UpdateFees(float con,float treat){
        setConsultationFee(con);
        setTreatmentFee(treat);
    }
    public void MarkAsPaid(){

        System.out.println("Bill no :"+getNamberOfBill()+" is paid ✅");
    }
    @Override
    public void CalculatePayment(){

        System.out.println("💲 Total treatment and consultation fees :"+getTotalAmount());
    }

}
