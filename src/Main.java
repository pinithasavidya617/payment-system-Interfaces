import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Payment mobilePayment = new MobilePayment(1000,"dialog","0771234577","ez chash");
        Payment cryptoPayment = new CryptoPayment(10000,"Binanace","BTC","123456786");
        Payment cashPayment = new CashPayment(1000, "C-Clarke",1000);


        List <Payment> payments = new ArrayList<>();

        payments.add(mobilePayment);
        payments.add(cryptoPayment);
        payments.add(cashPayment);

        for (Payment payment:payments){
            payment.printAmount();
        }

        Refundable refundableCashPayment = new CashPayment(1200,"keells",1500);
        Refundable refundableMobilePayment = new MobilePayment(1200,"keells","21333", "dialog");

        List <Refundable> refundables = new ArrayList<>();

        refundables.add(refundableMobilePayment);
        refundables.add(refundableCashPayment);

        for (Refundable payment:refundables){
            payment.getRefundPolicy();
        }



    }
}