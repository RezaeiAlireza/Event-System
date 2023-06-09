package com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Bookmark {
    private Integer userId;
    private List<Integer> eventIds;

    // Getters and setters...
}
