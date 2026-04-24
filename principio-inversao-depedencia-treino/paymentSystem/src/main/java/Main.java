public class Main {
    static void main() {
        CheckouInterface check1 = new PaymentPaypal();
        CheckouInterface check2 = new PaymentCartaoDeCredito();
        CheckouInterface check3 = new PaymentPix();
        //Checkout checkout = new Checkout(check1);
        //Checkout checkout = new Checkout(check2);
        Checkout checkout = new Checkout(check3);
        checkout.finishPurchase(205);
    }
}
