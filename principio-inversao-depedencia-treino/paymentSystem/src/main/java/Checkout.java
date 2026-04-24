public class Checkout {
    private final CheckouInterface checkout;
    public Checkout(CheckouInterface checkout){
        this.checkout = checkout;
    }

    void finishPurchase(double value){
        checkout.pay(value);
    }
}
