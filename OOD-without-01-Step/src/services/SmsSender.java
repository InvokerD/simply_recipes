package services;

public class SmsSender implements MessageSender{
    @Override
    public void sendNotification(String msg) {
        // SmsSender از sendSmsMessage برای پیامک استفاده می‌کند؛ sendEmail استفاده نمی‌شود
        sendSmsMessage(msg);
    }

    private void sendSmsMessage(String msg){
        System.out.println("Sent SMS: " + msg);
    }
}