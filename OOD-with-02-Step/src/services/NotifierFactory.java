package services;

import constants.Notifier;

public class NotifierFactory {
    public static ReservationNotifier getNotifier(Notifier type) {
        switch (type) {
            case EMAIL:
                return new EmailNotifier();
            case SMS:
                return new SmsNotifier();
            default:
                throw new IllegalArgumentException("Unknown notifier: " + type);
        }
    }
}
