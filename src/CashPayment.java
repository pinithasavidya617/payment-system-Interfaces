public class CashPayment extends Payment implements Refundable, Taxable{

    private double givenAmount;



    public CashPayment(double amount, String merchant, double givenAmount ) {
        super(amount, merchant);
        this.givenAmount = givenAmount;
    }

    @Override
    void process() {

        System.out.println("Processing cash payment..... " );

        if(givenAmount >= getAmount()){
            double balance =   givenAmount - getAmount();
            System.out.println("Your balance is -  "+ balance);
        } else {
            System.out.println("Invalid amount given");
        }

    }

    @Override
    public void refund() {
        System.out.println("Refunding Amount +" + this.getAmount());

    }

    @Override
    public String getRefundPolicy() {
        return "Payment will  be refunded only within 14 days";
    }

    @Override
    public double calculateTax() {
        return getTaxableAmount() * 0.15;
    }

    @Override
    public double getTaxableAmount() {
        return getAmount() * 0.50 ;
    }


}