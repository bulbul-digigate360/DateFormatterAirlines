package com.triplover.dateformatter.service;

import com.triplover.dateformatter.patterns.impl.Common;
import com.triplover.dateformatter.model.DateFormatter;
import org.springframework.stereotype.Service;

@Service
public class DateFormatterService {


    public String getDateFormattedDate(DateFormatter dateFormatter) {

//        if(dateFormatter.getAirlines().equals("AI")){
//            AI ai = new AI();
//            return ai.getFormattingDate(dateFormatter.getText());
//        }

        Common common = new Common();
        String dateForVR1 =  common.getFormattingDate(dateFormatter.getVendorRemarks1());
        String dateForVR2 = common.getFormattingDate(dateFormatter.getVendorRemarks2());

        //compare and which date is grater then return it
        return dateForVR2;

    }
}
