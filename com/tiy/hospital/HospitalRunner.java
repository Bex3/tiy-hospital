package com.tiy.hospital;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.HashMap;

/**
 * Created by dbashizi on 8/16/16.
 */
public class HospitalRunner
{
    public static void main(String[] args)
    {

        Adminstrator myAdministrator = new Adminstrator();
        System.out.println("Hello hospital administrator!");
        myAdministrator.largeAmountOfInfo();
        myAdministrator.documents();
        myAdministrator.tedious();


        Hospital myHospital = new Hospital();
        System.out.println("Welcome to " + myHospital.hospitalName);

        //ask the user what type of doc firstDoc is...
        //based on the type of doc, you're going to instantiate it as a different type
        Scanner inputScanner = new Scanner(System.in);


        ArrayList<String> myArrayListDocs = new ArrayList<String> ();
        for (int counter = 0; counter < 10; counter++) {
            myArrayListDocs.add();
            System.out.println(myArrayListDocs.get(counter));


        System.out.println("Please enter the doctor's first name ");
            myArrayListDocs.firstName.add(scanner.next());
        System.out.println("Please enter the doctor's last name ");
        System.out.println("Please enter the doctor's specialty ");














        HospitalDoctor firstDoc = new SurgicalOncologist("James", "Glavin", "MIT");
        Patient firstPatient = new Patient("David", "Polk");
        HospitalDoctor secondDoc = new Internist("Jackie", "Wright", "Emory");
        Patient newPatient = new Patient ("Chris", "Tanger");



        if (firstDoc instanceof SurgicalOncologist) {
            boolean success = ((SurgicalOncologist)firstDoc).operate(firstPatient);
            if (success) {
                System.out.println("Successful operation!");
            } else {
                System.out.println("Operation failed!!!");
            }
        }

        System.out.println("HospitalRunner.main() - done!");

    }







/*    public static void patientHashMap () {
        Scanner inputScanner = new Scanner(System.in);
        HashMap<String, Patient> patientsByName = new HashMap<>();
        Patient thisPatient = new Patient();
        System.out.println("Please enter patient's first name ");
        String userInput = inputScanner.nextLine();
        patientsByName.put(thisPatient.setFirstName(), thisPatient);
        System.out.println("Please enter patient's last name: ");
        userInput = inputScanner.nextLine();
        patientsByName.put(thisPatient.setLastName(), thisPatient);
        Person retrievedPerson = patientsByName.get(thisPatient);
        System.out.println("Patient's First Name: " + thisPatient.getFirstName());
        System.out.println("Patient's Last Name: " + thisPatient.getLastName());
    }*/
}
