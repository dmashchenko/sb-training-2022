package com.xpinjection.conference.service;

import com.xpinjection.conference.service.dto.ConferenceDto;

import java.util.List;

public interface ConferenceService {
    List<ConferenceDto> findAllConferences();
}
