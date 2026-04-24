public class Main {
    static void main() {
        NotificationInterface notifier = new EmailService();
        UserService user1 = new UserService(notifier);
        user1.userSendMessage("testando email");
        NotificationInterface notifierSms = new SmsService();
        user1.setNotification(notifierSms);
        user1.userSendMessage("testando sms envio");
    }
}
