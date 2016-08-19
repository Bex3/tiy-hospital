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
        Hospital myHospital = new Hospital();
        System.out.println("Welcome to " + myHospital.hospitalName);

        Scanner inputScanner = new Scanner(System.in);

        patientHashMap();
        HashMap<String, HospitalDoctor> userDoctors = exerciseWithDom(); // return must be caught - so we name a new variable before calling on the exercise method


        System.out.println();//need some space
        System.out.println();//need some mo space
        Adminstrator myAdministrator = new Adminstrator();
        System.out.println("Hello hospital administrator!");
        myAdministrator.largeAmountOfInfo();
        myAdministrator.documents();
        myAdministrator.tedious();


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



        System.out.println("Please enter the number corresponding to your illness or situation");
        System.out.println("1. Lung Cancer");
        System.out.println("2. Brain Cancer");
        System.out.println("3. Common Cold");
        System.out.println("4. Strep Throat ");
        System.out.println("5. Labor ");
        //System.out.println("-1. Undiagnosed"); // let's just stick to the basics
        inputScanner = new Scanner(System.in);

        int patientInput = 0;

        patientInput = Integer.valueOf(inputScanner.nextLine());

        for (HospitalDoctor doc: userDoctors.values()) {

            if (patientInput == 1 && doc instanceof Oncologist) {
                System.out.println("You should speak with our oncologist");
                Oncologist.treatmentOc();

            } else if (patientInput == 2 && doc instanceof SurgicalOncologist) {
                System.out.println("You should speak with our surgical oncologist");
                SurgicalOncologist.treatmentSO();
                break;
            } else if (patientInput == 3 && doc instanceof Internist) {
                System.out.println("You should speak with our internist");
                Internist.treatmentI();
                break;
            } else if (patientInput == 4 && doc instanceof Internist) {
                System.out.println("You should speak with our internist");
                Internist.treatmentI();
                break;
            } else if (patientInput == 5 && doc instanceof ObGyn) {
                System.out.println("You should speak with our OBGYN");
                ObGyn.treatmentO();
                break;

            } else if (!(doc instanceof Oncologist) || !(doc instanceof SurgicalOncologist) || !(doc instanceof
            Internist) || !(doc instanceof ObGyn)){
                System.out.println("I'm sorry, unfortunately, we do not have anyone that can see you at this moment. I will be happy to direct you to another hospital. ");
                break;
            }

        }

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

        public static HashMap<String, HospitalDoctor> exerciseWithDom() {
            HashMap<String, HospitalDoctor> doctorHash = new HashMap<String, HospitalDoctor>();
            while (true) {
                System.out.println("Would you like to add a doc (y/n)?");
                Scanner inputScanner = new Scanner(System.in);
                String continueFlag = inputScanner.nextLine();
                if (continueFlag.equals("n")) {
                    break;
                }
                // get input about the doc from the user
                System.out.println("Doc first name please:");
                String firstName = inputScanner.nextLine();
                System.out.println("Last name please: ");
                String lastName = inputScanner.nextLine();
                System.out.println("College");
                String college = inputScanner.nextLine();
                System.out.println("What specialty?");
                System.out.println("1. Surgical Oncology");
                System.out.println("2. Internist");
                System.out.println("3. OBGYN");
                int specialty = Integer.valueOf(inputScanner.nextLine());

                // create the doc object
                HospitalDoctor doc = null;
                if (specialty == 1) {
                    doc = new SurgicalOncologist(firstName, lastName, college);
                } else if (specialty == 2) {
                    doc = new Internist(firstName, lastName, college);
                } else if (specialty == 3){
                    doc = new ObGyn(firstName, lastName, college);
                }

                // add it to the collection
                doctorHash.put(doc.getFirstName(), doc);
                doctorHash.put(doc.getLastName(), doc);
                doctorHash.put(doc.getCollege(), doc);
            }


            System.out.println("You have added: " + doctorHash.values());
            return doctorHash;

        }

        /*public static void doctorHashMap(HospitalDoctor nameOne, String firstName, String lastName, String college) {
            Scanner inputScanner = new Scanner (System.in);
            inputScanner = new Scanner(System.in);
            HashMap<String, Doctor> doctorsByName = new HashMap<String, Doctor>();
            //HospitalDoctor nameOne = new nameOne();
            //nameOne = new HospitalDoctor(); //can't instantiate, but it won't recognize nameone.
            System.out.println("How many doctors would you like to enter?");
            int numDocs = Integer.valueOf(inputScanner.nextLine());
            for (int howMany= 0; howMany < numDocs; howMany ++) {
                System.out.println("Please input the doctor's first name");
                String userInput = inputScanner.nextLine();
                doctorsByName userInput = inputScanner.nextLine();
                nameOne.setFirstName(userInput);
                System.out.println("Please enter the doctor's last name");
                String userIput = inputScanner.nextLine();
                nameOne.setLastName(userInput);
                System.out.println("Please enter the doctor's college");
                nameOne.this.College(userInput);

                String hospitalDoctorFirstName = nameOne.getFirstName();
                String hospitalDoctorLastName = nameOne.getLastName();
                String hospitalDoctorCollege = nameOne.getCollege();*/
           // }
        //}
}

