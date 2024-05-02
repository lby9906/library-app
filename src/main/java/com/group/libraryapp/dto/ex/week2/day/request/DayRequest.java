package com.group.libraryapp.dto.ex.week2.day.request;


public class DayRequest {
    private String dayOfTheWeek;

    public DayRequest(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }
}
