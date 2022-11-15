package com.triplover.dateformatter.patterns.impl;

import com.triplover.dateformatter.patterns.IPatterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sw4DEwAC implements IPatterns {

    @Override
    public String getFormattingDate(String code) {

        //String code = "VRMK-VI/AAI *AUTO XX IF SSR TKNA/E/M/C NOT RCVD BY AI BY 1954/10OCT/ DAC LT 1254Z 10OCT";


        Pattern pattern = Pattern.compile("(\\d{4})");
        Matcher matcher = pattern.matcher(code);

        String val = "";
        if (matcher.find()) {
            System.out.println(matcher.group(0));

            val = matcher.group(0);
        }

        int indexOfYear = code.indexOf(matcher.group(0));

        System.out.println("Extracted date : " + code.substring(indexOfYear, indexOfYear+15));
        return code.substring(indexOfYear, indexOfYear+15);
    }
}
