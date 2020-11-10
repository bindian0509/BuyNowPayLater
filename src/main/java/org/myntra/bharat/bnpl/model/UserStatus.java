package org.myntra.bharat.bnpl.model;

/*
 * Developer : Bharat Verma
 * Created : Mon 09-Nov-2020 03:52 PM
 **/
public enum UserStatus {

    ENABLED(0, "Enabled"),
    DISABLED(1, "Disabled");

    private Integer id;
    private String displayName;

    UserStatus(Integer id, String displayName) {
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
