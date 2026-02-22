package services;

import constants.Notifier;

public class ReservationService {

    private Notifier notifier = Notifier.EMAIL; // پیش‌فرض اعلان‌دهنده
    public void makeReservation(Reservation reservation, PaymentProcessor processor){

        System.out.println("Reserving room " + reservation.room.number + " for " + reservation.customer.name);

        double total = reservation.totalPrice();
        System.out.println("Total price: " + total);

        switch (notifier) {
            case EMAIL -> processor.payByCard(total);
            case SMS -> processor.payByCash(total);
            default -> System.out.println("Not supported yet");
        }

    }
}