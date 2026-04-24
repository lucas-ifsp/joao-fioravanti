public class UserService {
    private NotificationInterface notifier;

    public UserService(NotificationInterface notifier){
        this.notifier = notifier;
    }

    void userSendMessage(String message){
        notifier.sendMessage(message);
    }

    public NotificationInterface getNotifier() {
        return notifier;
    }

    public void setNotification(NotificationInterface notifier) {
        if(notifier == null) return;
        this.notifier = notifier;
    }
}
