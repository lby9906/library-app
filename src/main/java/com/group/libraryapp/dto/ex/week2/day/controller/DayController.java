package com.group.libraryapp.dto.ex.week2.day.controller;

import com.group.libraryapp.dto.ex.week2.day.request.DayRequest;
import com.group.libraryapp.dto.ex.week2.day.response.DayResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class DayController {

    @GetMapping("/api/v1/day-of-the-week")
    public DayResponse dayResponse(DayRequest request){
        LocalDate localDate = LocalDate.parse(request.getDayOfTheWeek());
        return new DayResponse(String.valueOf(localDate.getDayOfWeek()).substring(0,3));
    }
}
