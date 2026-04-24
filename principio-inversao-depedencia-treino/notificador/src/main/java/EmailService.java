public class EmailService implements NotificationInterface {
    @Override
    public void sendMessage(String message) {
        System.out.println("mensagem enviada via email: "+ message);
    }
}
