public class SmsService implements NotificationInterface{
    @Override
    public void sendMessage(String message) {
        System.out.println("mensagem enviada via sms: "+message);
    }
}
