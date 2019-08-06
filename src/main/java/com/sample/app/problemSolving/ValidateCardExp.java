package com.sample.app.problemSolving;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidateCardExp {

    public static boolean isCardValid(String cardDate) {
        try {
            DateFormat dateformat = new SimpleDateFormat("MMyy");
            Date expiryDate = dateformat.parse(cardDate);

            Date currentDate = new Date();

            if (currentDate.after(expiryDate))
                return false;
            else
                return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isCardValid("0412"));
        System.out.println(isCardValid("0420"));
    }
}