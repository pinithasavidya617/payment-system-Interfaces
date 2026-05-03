public abstract class Payment {
    //blueprint, cannot create objects with an abstract class
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
    //Any class that extends Payment MUST implement process()

    public double getAmount() {
        return amount;
    }

    public String getMerchant() {
        return merchant;
    }

}