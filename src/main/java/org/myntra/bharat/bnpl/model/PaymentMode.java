package org.myntra.bharat.bnpl.model;

/*
 * Developer : Bharat Verma
 * Created : Mon 09-Nov-2020 03:56 PM
 **/
public enum PaymentMode {

    PREPAID (0, "Prepaid"),
    BNPL (1, "Buy Now Pay Later");

    private Integer id;
    private String displayName;

    PaymentMode(Integer id, String displayName) {
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
