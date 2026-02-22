package services;

public class EmailNotifier implements ReservationNotifier {
    @Override
    public void sendConfirmation(Reservation res, String message) {
        System.out.println("Sending email to " + res.customer.email + ": " + message);
    }
}
