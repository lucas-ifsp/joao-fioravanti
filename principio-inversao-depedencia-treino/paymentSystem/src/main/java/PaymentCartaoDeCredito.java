public class PaymentCartaoDeCredito implements CheckouInterface{
    @Override
    public void pay(double value) {
        System.out.println("valor a ser tranferido via Cartão de Credito: "+value);
    }
}
