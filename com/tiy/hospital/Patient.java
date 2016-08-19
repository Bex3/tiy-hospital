package com.tiy.hospital;

/**
 * Created by dbashizi on 8/16/16.
 */
public class Patient extends Person {
    private boolean isSick = true;

    public Patient() {
    }


    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public Patient(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
