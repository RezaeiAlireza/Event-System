package com;

import java.time.LocalDate;
import java.time.LocalTime;

public class Notification {
    private Integer userId;
    private String message;
    private LocalDate date;
    private LocalTime time;

    private Event event;

    public Notification(Integer userId, Event event, String message) {

        this.userId = userId;
        this.message = message;
        this.event = event;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getMessage() {
        return message;
    }

    public Event getEvent() {
        return event;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
