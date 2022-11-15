package com.triplover.dateformatter.service;

import com.triplover.dateformatter.check.CheckForSw4DEwAC;
import com.triplover.dateformatter.patterns.impl.Common;
import com.triplover.dateformatter.model.DateFormatter;
import org.springframework.stereotype.Service;

@Service
public class DateFormatterService {



    public String getDateFormattedDate(DateFormatter dateFormatter) {


        String formattedDate="";

        //check for Sw4DOr2DwMEwAC
        CheckForSw4DEwAC checkForSw4DOr2DwMEwAC = new CheckForSw4DEwAC();
        formattedDate=checkForSw4DOr2DwMEwAC.check(dateFormatter.getVendorRemarks1(),dateFormatter.getVendorRemarks2());
        if(formattedDate!=null){
            return formattedDate;
        }

        //check for another pattern
        Common common = new Common();





        //compare and which date is grater then return it
        return null;

    }
}
