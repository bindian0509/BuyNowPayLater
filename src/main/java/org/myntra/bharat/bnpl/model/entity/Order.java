package org.myntra.bharat.bnpl.model.entity;

/*
 * Developer : Bharat Verma
 * Created : Mon 09-Nov-2020 03:38 PM
 **/

import lombok.Data;
import org.myntra.bharat.bnpl.model.OrderStatus;
import org.myntra.bharat.bnpl.model.PaymentMode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Order {

    private String orderId;
    private String userId;
    private List<String> productId;

    private String totalAmount;
    private LocalDateTime orderedAt;

    private OrderStatus orderStatus;
    private PaymentMode paymentMode;
    private double dueAmount;

    private boolean duesPayed;
    //private LocalDate dueDate;

}
