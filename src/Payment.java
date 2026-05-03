public abstract class Payment {
    protected double amount;
    protected String merchant;

    public Payment(double amount, String merchant){
        this.amount = amount;
        this.merchant = merchant;
    }

    public void printAmount(){
        System.out.println("Amount - "+  this.amount + "Payed to merchant t "+ this.merchant);
    }

    abstract void process();

    public double getAmount() {
        return amount;
    }

    public String getMerchant() {
        return merchant;
    }

}