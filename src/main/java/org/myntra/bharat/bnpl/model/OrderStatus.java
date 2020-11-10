package org.myntra.bharat.bnpl.model;

/*
 * Developer : Bharat Verma
 * Created : Mon 09-Nov-2020 03:56 PM
 **/
public enum OrderStatus {

    PLACED (0,"Placed"),
    SHIPPED (1,"Shipped"),
    DELIVERED (2,"Delivered"),
    REFUNDED (3,"Refunded");

    private Integer id;
    private String displayName;

    OrderStatus(Integer id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    public Integer getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }
}
