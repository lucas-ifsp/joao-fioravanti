public class PaymentPix implements CheckouInterface{
    @Override
    public void pay(double value) {
        System.out.println("valor a ser tranferido via pix: "+value);
    }
}
