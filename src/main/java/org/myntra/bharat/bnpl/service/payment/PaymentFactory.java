package org.myntra.bharat.bnpl.service.payment;

import org.myntra.bharat.bnpl.model.PaymentMode;

/*
 * Developer : Bharat Verma
 * Created : Mon 09-Nov-2020 04:12 PM
 **/
public interface PaymentFactory {

    PrepaidPayment prepaidPayment = new PrepaidPayment();
    BNPLPayment bnplPayment = new BNPLPayment();

    default PaymentService getPaymentService(PaymentMode mode) {

        if(mode.equals(PaymentMode.BNPL))
            return bnplPayment;
        else
            return prepaidPayment;
    }

}
