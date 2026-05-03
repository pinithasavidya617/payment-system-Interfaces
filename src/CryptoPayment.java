public class CryptoPayment extends Payment{

    private String walletAddress;
    private String currenncy;



    public CryptoPayment(double amount, String merchant, String currency,String walletAddress) {
        super(amount, merchant);
        this.walletAddress = walletAddress;
        this.currenncy = currency;
    }

    @Override
    void process() {

        System.out.println("Processing crypto payment with " + this.currenncy);
        System.out.println("For amount of - "+ getAmount());

    }
}