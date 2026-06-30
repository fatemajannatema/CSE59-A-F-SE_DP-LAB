interface MessageSender{
    void sendMessage(String message);
}
class EmailSender implements MessageSender{
    @Override
    public void sendMessage(String message){
        System.out.println("Sending Email:"+message);
    }
}

class SMSSender implements MessageSender{

    @Override
    public void sendMessage(String message){
        System.out.println("Sending Sms" + message);
    }
}

class NotificationService{
    private MessageSender messageSender;
    public NotificationService(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void alertUser(String message){
        messageSender.sendMessage(message);
    }

}

public class Main2 {

    public static void main(String[] args){

        MessageSender email = new EmailSender();
        NotificationService emailService = new NotificationService(email);
        emailService.alertUser("Welcome to our website!");

        MessageSender sms = new SMSSender();
        NotificationService smsService = new NotificationService(sms);
        smsService.alertUser("Your OTP is 123456");

    }
    
}

