package com.tiy.hospital;

/**
 * Created by bearden-tellez on 8/19/16.
 */
public class Oncologist extends HospitalDoctor {
    public Oncologist(String firstName, String lastName, String college) {
        super(firstName, lastName, college);
    }

    public Diagnosis diagnose() {
        return new Diagnosis(Diagnosis.LUNG_CANCER);
    }
    public static void treatmentOc(){
        System.out.println("We can get you started on chemo after completing a battery of tests.");
    }

}
