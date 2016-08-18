package com.tiy.hospital;

/**
 * Created by bearden-tellez on 8/17/16.
 */
public class Adminstrator extends Person  implements PaperWork{
    public void largeAmountOfInfo(){
        System.out.println("15 new patients admitted in 30 minutes, you still have a backlog of 250 from yesterday.  ");
    }

    public void documents(){
        System.out.println("You have 1,000 documents to check & file today.");
    }

    public void tedious(){
        System.out.println("Please don't forget to color code for patient billing. ");
    }


}



