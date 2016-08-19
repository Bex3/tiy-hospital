package com.tiy.hospital;

/**
 * Created by dbashizi on 8/16/16.
 */
public class SurgicalOncologist extends HospitalDoctor implements Surgeon {

    public SurgicalOncologist(String firstName, String lastName, String college) {
        super(firstName, lastName, college);
    }

    public Diagnosis diagnose() {
        return new Diagnosis(Diagnosis.BRAIN_CANCER);
    }

    public boolean operate(Patient patient) {
        patient.setSick(false);
        return true; // successful operation
    }
    public static void treatmentSO(){
        System.out.println("I have scheduled your surgery for next Tuesday at 9:00 AM. ");
    }

}
