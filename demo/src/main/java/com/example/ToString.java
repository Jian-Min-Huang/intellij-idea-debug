package com.example;

import java.util.Objects;

public class ToString {
    private String stringField;
    private Integer intField;
    private Boolean booleanField;

    public ToString() {
    }

    public ToString(String stringField, Integer intField, Boolean booleanField) {
        this.stringField = stringField;
        this.intField = intField;
        this.booleanField = booleanField;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public Integer getIntField() {
        return intField;
    }

    public void setIntField(Integer intField) {
        this.intField = intField;
    }

    public Boolean getBooleanField() {
        return booleanField;
    }

    public void setBooleanField(Boolean booleanField) {
        this.booleanField = booleanField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToString toString = (ToString) o;
        return Objects.equals(stringField, toString.stringField) && Objects.equals(intField, toString.intField) && Objects.equals(booleanField, toString.booleanField);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(stringField);
        result = 31 * result + Objects.hashCode(intField);
        result = 31 * result + Objects.hashCode(booleanField);
        return result;
    }

    @Override
    public String toString() {
        return "ToString{" +
            "stringField='" + stringField + '\'' +
            ", intField=" + intField +
            ", booleanField=" + booleanField +
            '}';
    }
}
