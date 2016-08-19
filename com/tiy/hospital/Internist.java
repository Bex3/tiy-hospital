package com.tiy.hospital;

/**
 * Created by bearden-tellez on 8/17/16.
 */
public class Internist extends HospitalDoctor {

    public Internist(String firstName, String lastName, String college) {
        super(firstName, lastName, college);
    }

    public Diagnosis diagnose() {
        return new Diagnosis(Diagnosis.COMMON_COLD);
    }

    public void processOnePerson(Person personToProcess) {
        // do something to a person object
    }



}
