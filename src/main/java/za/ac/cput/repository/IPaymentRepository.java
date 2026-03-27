/*
 * Name:Snalo Noni Hoyose
 *Student Nr: 230541844
 * Date: 25 March 2026  */


package za.ac.cput.repository;

import za.ac.cput.domain.Payment;
import java.util.Set;

public interface IPaymentRepository extends IRepository<Payment, String> {
    Set<Payment> getAll();
}
