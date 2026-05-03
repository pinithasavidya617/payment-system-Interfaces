public class MobilePayment extends Payment implements Refundable{

    private String mobileNo;
    private String mobileApp;


    public MobilePayment(double amount, String merchant, String mobileNo, String mobileApp) {
        super(amount, merchant);
        this.mobileNo = mobileNo;
        this.mobileApp = mobileApp;
    }

    @Override
    void process() {

        System.out.println(" Mobile ");

    }


    @Override
    public void refund() {
        System.out.println("Refunfding mobile payment "+ getAmount());

    }

    @Override
    public String getRefundPolicy() {

        return  "Payment will  be refunded only within 14 days";
    }
}