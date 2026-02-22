package services;

public class SmsNotifier implements ReservationNotifier {
    @Override
    public void sendConfirmation(Reservation res, String message) {
        System.out.println("Sending SMS to " + res.customer.mobile + ": " + message);
    }
}
