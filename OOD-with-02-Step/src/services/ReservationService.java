package services;

public class ReservationService {

    public void makeReservation(Reservation res, PaymentMethod paymentMethod, ReservationNotifier notifier) {
        System.out.println("Processing reservation for " + res.customer.name);

        if (res.customer.city.equals("Paris")) {
            System.out.println("Apply city discount for Paris!");
            res.room.price *= 0.9;
        }

        paymentMethod.pay(res.totalPrice());

        System.out.println("----- INVOICE -----");
        System.out.println("hotel.Customer: " + res.customer.name);
        System.out.println("hotel.Room: " + res.room.number + " (" + res.room.type + ")");
        System.out.println("Total: " + res.totalPrice());
        System.out.println("-------------------");

        notifier.sendConfirmation(res, "Your reservation confirmed!");
    }
}
