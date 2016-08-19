package com.tiy.hospital;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.HashMap;

/**
 * Created by dbashizi on 8/16/16.
 */
public class HospitalRunner
{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        patientHashMap();
        //doctorHashMap();

        Adminstrator myAdministrator = new Adminstrator();
        System.out.println("Hello hospital administrator!");
        myAdministrator.largeAmountOfInfo();
        myAdministrator.documents();
        myAdministrator.tedious();


        Hospital myHospital = new Hospital();
        System.out.println("Welcome to " + myHospital.hospitalName);

        //ask the user what type of doc firstDoc is...
        //based on the type of doc, you're going to instantiate it as a different type



 /*       ArrayList<String> myArrayListDocs = new ArrayList<String>();
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
            Patient newPatient = new Patient("Chris", "Tanger");


            if (firstDoc instanceof SurgicalOncologist) {
                boolean success = ((SurgicalOncologist) firstDoc).operate(firstPatient);
                if (success) {
                    System.out.println("Successful operation!");
                } else {
                    System.out.println("Operation failed!!!");
                }
            }*/


        System.out.println("Please enter the doctor's first name");

        System.out.println("Please enter the doctor's last name");

        System.out.println("Please enter the number for the doctor's speciality. ");


        System.out.println("Please enter the number corresponding to your illness or situation");
        System.out.println("1. Lung Cancer");
        System.out.println("2. Brain Cancer");
        System.out.println("3. Common Cold");
        System.out.println("4. Strep Throat ");
        System.out.println("5. Labor ");
        System.out.println("-1. Undiagnosed");
        inputScanner = new Scanner(System.in);
        int patientInput = 0;
        patientInput = Integer.valueOf (inputScanner.nextLine());
        if (patientInput == 1)

        





            System.out.println("HospitalRunner.main() - done!");

        }

        public static void patientHashMap() {
            Scanner inputScanner = new Scanner(System.in);
            inputScanner = new Scanner(System.in);
            HashMap<String, Patient> patientsByName = new HashMap<String, Patient>();
            Patient thisPatient = new Patient();
            System.out.println("Please enter patient's first name ");
            String userInput = inputScanner.nextLine();
            thisPatient.setFirstName(userInput);
            System.out.println("Please enter patient's last name: ");
            userInput = inputScanner.nextLine();
            thisPatient.setLastName(userInput);
            String patientFirstName = thisPatient.getFirstName();
            String patientLastName = thisPatient.getLastName();
            patientsByName.put(thisPatient.getFirstName(), thisPatient);
            System.out.println("This patient is " + thisPatient.getFirstName()+ " " + thisPatient.getLastName());
            //System.out.println("This person:" + thisPatient.getFirstName() + thisPatient.getFirstName());
        }

        public static void doctorHashMap(HospitalDoctor nameOne) {
            Scanner inputScanner = new Scanner (System.in);
            inputScanner = new Scanner(System.in);
            HashMap<String, Doctor> doctorsByName = new HashMap<String, Doctor>();
            //nameOne = new HospitalDoctor(); //can't instantiate, but it won't recognize nameone.
            System.out.println("How many doctors would you like to enter?");
            int numDocs = Integer.valueOf(inputScanner.nextLine());
            for (int howMany= 0; howMany < numDocs; howMany ++) {
                System.out.println("Please input the doctor's first name");
                String userInput = inputScanner.nextLine();
                nameOne.setFirstName(userInput);
                System.out.println("Please enter the doctor's last name");
                String userIput = inputScanner.nextLine();
                nameOne.setLastName(userInput);
                System.out.println("Please enter the doctor's college");
                nameOne.this.College(userInput);

                String hospitalDoctorFirstName = nameOne.getFirstName();
                String hospitalDoctorLastName = nameOne.getLastName();
                String hospitalDoctorCollege = nameOne.getCollege();
            }
        }
}

