public class PaymentPaypal implements CheckouInterface{
    @Override
    public void pay(double value) {
        System.out.println("valor a ser tranferido via paypal: "+value);
    }
}
