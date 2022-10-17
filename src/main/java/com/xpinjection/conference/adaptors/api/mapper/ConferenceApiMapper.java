package com.xpinjection.conference.adaptors.api.mapper;

import com.xpinjection.conference.adaptors.api.dto.ConferenceResponseDto;
import com.xpinjection.conference.service.dto.ConferenceDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConferenceApiMapper {
    ConferenceApiMapper INSTANCE = Mappers.getMapper(ConferenceApiMapper.class);

    ConferenceResponseDto toResponseDto(ConferenceDto conf);
}
