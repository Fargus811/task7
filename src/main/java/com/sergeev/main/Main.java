package com.sergeev.main;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        System.out.println("1 - английский \n2 - белорусский");
        char result = 0;
        try {
            result = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String country = "";
        String language = "";
        switch (result) {
            case '1':
                country = "US";
                language = "en";
                break;
            case '2':
                country = "BY";
                language = "be";
                break;
        }
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", current);
        String s1 = rb.getString("str1");
        System.out.println(s1);
        String s2 = rb.getString("str2");
        System.out.println(s2);
    }
}

