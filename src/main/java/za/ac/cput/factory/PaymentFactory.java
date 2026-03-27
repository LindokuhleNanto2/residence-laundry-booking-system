/*
 * Name:Snalo Noni Hoyose
 *Student Nr: 230541844
 * Date: 18 March 2026  */


package za.ac.cput.factory;

import za.ac.cput.domain.Payment;
import java.time.LocalDate;

public class PaymentFactory {
    public static Payment createPayment(String paymentId, double amount, LocalDate paymentDate, String paymentMethod) {
        if (paymentId == null || paymentId.isEmpty() || amount <= 0 || paymentDate == null || paymentMethod == null) {
            return null;
        }
        return new Payment.Builder()
                .setPaymentId(paymentId)
                .setAmount(amount)
                .setPaymentDate(paymentDate)
                .setPaymentMethod(paymentMethod)
                .build();
    }
}
