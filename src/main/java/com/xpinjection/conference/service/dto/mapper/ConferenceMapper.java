package com.xpinjection.conference.service.dto.mapper;

import com.xpinjection.conference.domain.Conference;
import com.xpinjection.conference.service.dto.ConferenceDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConferenceMapper {
    ConferenceMapper INSTANCE = Mappers.getMapper(ConferenceMapper.class);

    ConferenceDto toDto(Conference conf);
}
