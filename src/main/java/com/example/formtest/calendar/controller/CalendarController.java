package com.example.formtest.calendar.controller;


import com.example.formtest.calendar.CalendarDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CalendarController {
    private ArrayList<CalendarDTO> calList = new ArrayList<>();

    @GetMapping("/all/schedule")
    public ArrayList<CalendarDTO> allSchedule(){
        return calList;
    }

    @GetMapping("/put/schedule")
    public ArrayList<CalendarDTO> putSchedule(CalendarDTO calendarDTO){
        if(calendarDTO.getTitle().equals("Clear")){
            calList.clear();
            return calList;
        }
        if(!calList.contains(calendarDTO)){
            calList.add(calendarDTO);
        }else{
            calList.remove(calendarDTO);
        }
        return calList;
    }


}
