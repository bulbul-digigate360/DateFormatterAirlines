package com.triplover.dateformatter.controller;



import com.triplover.dateformatter.model.DateFormatter;
import com.triplover.dateformatter.service.DateFormatterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class DateFormatterController {

    private final DateFormatterService dateFormatterService;

    public DateFormatterController(DateFormatterService dateFormatterService){
        this.dateFormatterService = dateFormatterService;
    }

    @PostMapping("/getFormattedDate")
    public String getFormattedDate(@RequestBody DateFormatter dateFormatter){

        return this.dateFormatterService.getDateFormattedDate(dateFormatter);
    }
}
