package com.tiy.hospital;

import java.util.ArrayList;

/**
 * Created by bearden-tellez on 8/17/16.
 */
public class Hospital {
    String hospitalName = "All Saints Hospital";
    ArrayList<Person> myPeople = new ArrayList<Person>();

    public void processAllThePeople() {
        Internist myInternist = new Internist(null, null, null);
        for (Person currentPerson : myPeople) {
            myInternist.processOnePerson(currentPerson);
        }
    }

}
