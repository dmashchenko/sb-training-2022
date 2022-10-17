package com.xpinjection.conference.service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ConferenceDto {
    private Integer id;
    private String name;
    private String category;
    private LocalDateTime date;
    private Integer participantCount;
}
