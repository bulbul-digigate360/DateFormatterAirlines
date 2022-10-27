package com.triplover.dateformatter.check;


import com.triplover.dateformatter.patterns.impl.Sw4DOr2DwMEwAC;
import org.springframework.stereotype.Service;

@Service
public class CheckForSw4DOr2DwMEwAC {

    public String check(String vendorRemarks1, String vendorRemarks2 ){

        String finalValue = "";

        Sw4DOr2DwMEwAC sw4DOr2DwMEwAC = new Sw4DOr2DwMEwAC();

        String dateForVR1 =  sw4DOr2DwMEwAC.getFormattingDate(vendorRemarks1);
        String dateForVR2="";
        if(vendorRemarks2!=null){
            dateForVR2 = sw4DOr2DwMEwAC.getFormattingDate(vendorRemarks2);
        }

        finalValue=dateForVR2;

        if(finalValue!=null){
            return finalValue;
        }
        return null;
    }
}
