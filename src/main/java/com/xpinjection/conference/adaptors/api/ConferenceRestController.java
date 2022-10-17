package com.xpinjection.conference.adaptors.api;

import com.xpinjection.conference.adaptors.api.dto.ConferenceResponseDto;
import com.xpinjection.conference.adaptors.api.mapper.ConferenceApiMapper;
import com.xpinjection.conference.service.ConferenceService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "conferences")
@Validated
@RestController
@RequiredArgsConstructor
public class ConferenceRestController {
    private final ConferenceService conferenceService;

    @GetMapping(value = "/conferences", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ConferenceResponseDto> findAll() {
        return conferenceService.findAllConferences().stream()
                .map(ConferenceApiMapper.INSTANCE::toResponseDto)
                .toList();
    }
}
