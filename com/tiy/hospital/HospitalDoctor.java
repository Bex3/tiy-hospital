package com.tiy.hospital;

/**
 * Created by dbashizi on 8/16/16.
 */
public abstract class HospitalDoctor extends Person implements Doctor {
    private String college;

    //HospitalDoctor nameOne = new HospitalDoctor();


    public HospitalDoctor(String firstName, String lastName, String college) {
        super(firstName, lastName);
        this.college = college;
        //HospitalDoctor nameOne = new HospitalDoctor();
        //HospitalDoctor nameOne = new HospitalDoctor (String firstName, String lastName, String college);
    }


    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
