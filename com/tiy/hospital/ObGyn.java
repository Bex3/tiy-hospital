package com.tiy.hospital;

/**
 * Created by bearden-tellez on 8/19/16.
 */
public class ObGyn extends HospitalDoctor{

    public ObGyn(String firstName, String lastName, String college) {
        super(firstName, lastName, college);
    }

    public Diagnosis diagnose() {
        return new Diagnosis(Diagnosis.LABOR);
    }
}
