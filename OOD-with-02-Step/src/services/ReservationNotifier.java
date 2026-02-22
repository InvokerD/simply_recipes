package services;

public interface ReservationNotifier {
    void sendConfirmation(Reservation res, String message);
}
