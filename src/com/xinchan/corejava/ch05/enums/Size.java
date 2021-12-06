package com.xinchan.corejava.ch05.enums;

/**
 * @author zegxn
 * @version 1.0.1 2021-11-06
 */

public enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    // instance field
    private String abbreviation;

    // constructor
    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    // methods
    public String getAbbreviation() {
        return abbreviation;
    }
}
