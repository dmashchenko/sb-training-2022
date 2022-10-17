package com.xpinjection.conference.adaptors.api.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ConferenceResponseDto {
    private Integer id;
    private String name;
    private String category;
    private LocalDateTime date;
    private Integer participantCount;
}
