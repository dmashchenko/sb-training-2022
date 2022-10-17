package com.xpinjection.conference.service.impl;

import com.xpinjection.conference.adaptors.persistence.ConferenceRepository;
import com.xpinjection.conference.service.ConferenceService;
import com.xpinjection.conference.service.dto.ConferenceDto;
import com.xpinjection.conference.service.dto.mapper.ConferenceMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class ConferenceServiceImpl implements ConferenceService {

    private final ConferenceRepository conferenceRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ConferenceDto> findAllConferences() {
        return conferenceRepository.findAll()
                .stream()
                .map(ConferenceMapper.INSTANCE::toDto)
                .toList();
    }
}
