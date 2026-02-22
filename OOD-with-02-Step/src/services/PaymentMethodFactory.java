package services;

import constants.PaymentMethods;

public class PaymentMethodFactory {
    public static PaymentMethod getPaymentMethod(PaymentMethods type) {
        switch (type) {
            case CARD:
                return new CardPayment();
            case PAYPAL:
                return new PayPalPayment();
            case CASH:
                return new CashPayment();
            case ONSITE:
                return new OnSitePayment();
            default:
                throw new IllegalArgumentException("Unknown payment method: " + type);
        }
    }
}
