package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    //custom methods
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField that = (JobField) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

//
//    Consider the following questions to help you decide what code to put in the JobField class:
//
//        What fields do ALL FOUR of the classes have in common? (id, nextId, value)
//        Which constructors are the same in ALL FOUR classes? (id constructor, value constructor)
//        What getters and setters do ALL of the classes share? (getValue, setValue, getId
//        Which custom methods are identical in ALL of the classes? (toString, equals, hashCode)
//
//        In JobField, declare each of the common fields.
//
//        Code the constructors.
//
//        Use Generate to create the appropriate getters and setters.
//
//        Add in the custom methods.
//
//        Finally, to prevent the creation of a JobField object, make this class abstract.