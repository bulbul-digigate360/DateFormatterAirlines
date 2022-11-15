package com.triplover.dateformatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class DateFormatterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DateFormatterApplication.class, args);

        String OCT="OCT";

//        String code = "VRMK-VI/AAI *AUTO XX IF SSR TKNA/E/M/C NOT RCVD BY AI BY 1954/10OCT/ DAC LT 1254Z 10OCT";
//
//        StringBuffer sb = new StringBuffer();
//
//        Pattern pattern = Pattern.compile("(\\d{4})");
//        Matcher matcher = pattern.matcher(code);
//
//        String val = "";
//        if (matcher.find()) {
//            System.out.println(matcher.group(0));
//
//            val = matcher.group(0);
//        }
//
//        int indexOfYear = code.indexOf(matcher.group(0));
//
//        System.out.println("Extracted date : " + code.substring(indexOfYear, indexOfYear+15));





    }

}
