package com.example.formtest.calendar;

import java.util.Objects;

public class CalendarDTO {
    private String title;
    private String date;

    public CalendarDTO(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public CalendarDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalendarDTO that = (CalendarDTO) o;
        return title.equals(that.title) && date.equals(that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date);
    }
}
