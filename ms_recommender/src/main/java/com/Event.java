package com;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Event {

    @Id
    @TableGenerator(
            name = "Event_SEQ",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Event_SEQ")

    private Integer eventId;
    private String title;
    private String type;
    private String description;
    private Integer organizerId;
    private String location;
    private LocalDate date;
    private LocalTime time;
    private Integer capacity;
    private Integer attendeeCount;



    public Event(String title,
                 String type, String description,
                 Integer organizerId, String location,
                 LocalDate date, LocalTime time,
                 Integer capacity, Integer attendeeCount) {

        this.title = title;
        this.type = type;
        this.description = description;
        this.organizerId = organizerId;
        this.location = location;
        this.date = date;
        this.time = time;
        this.capacity = capacity;
        this.attendeeCount = attendeeCount;
    }
}
