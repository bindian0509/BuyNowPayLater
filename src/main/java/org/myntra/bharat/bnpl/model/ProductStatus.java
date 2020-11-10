package org.myntra.bharat.bnpl.model;
/*
 * Developer : Bharat Verma
 * Created : Mon 09-Nov-2020 03:45 PM
 **/
public enum ProductStatus {

    ACTIVE(0, "Active"),
    INACTIVE(1, "In Active");

    ProductStatus(Integer id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    private Integer id;
    private String displayName;

    public Integer getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }
}
