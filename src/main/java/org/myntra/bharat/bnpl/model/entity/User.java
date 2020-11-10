package org.myntra.bharat.bnpl.model.entity;

import lombok.Data;
import org.myntra.bharat.bnpl.model.UserStatus;

import java.time.LocalDate;

/*
 * Developer : Bharat Verma
 * Created : Mon 09-Nov-2020 03:37 PM
 **/
@Data
public class User {

    //unique identifier for the users
    private String phone;
    private String email;
    private String name;
    private UserStatus userStatus;
    private double outStandingAmount;
    private int daysToPay;
}
