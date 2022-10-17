package com.xpinjection.conference.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conference_id_seq")
    @SequenceGenerator(name = "conference_id_seq", sequenceName = "conference_id_seq", allocationSize = 1)
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private String category;

    @NotNull
    private LocalDateTime date;

    @NotNull
    @Min(101)
    private Integer participantCount;
}
