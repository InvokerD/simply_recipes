import constants.PaymentMethods;
import models.Customer;
import models.LuxuryRoom;
import constants.Notifier;
import services.Reservation;
import models.Room;
import services.ReservationService;
import services.PaymentMethodFactory;
import services.NotifierFactory;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ali", "ali@example.com", "09124483765", "Paris");
        Room room = new LuxuryRoom("203", 150);
        Reservation res = new Reservation(room, customer, 2);

        ReservationService service = new ReservationService();
        service.makeReservation(res,
                PaymentMethodFactory.getPaymentMethod(PaymentMethods.PAYPAL),
                NotifierFactory.getNotifier(Notifier.EMAIL));
    }
}
