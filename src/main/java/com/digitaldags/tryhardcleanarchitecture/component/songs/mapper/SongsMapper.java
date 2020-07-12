package com.digitaldags.tryhardcleanarchitecture.component.songs.mapper;

import com.digitaldags.tryhardcleanarchitecture.component.songs.model.domain.Songs;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.response.SongsResponseDto;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.entity.SongsEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SongsMapper {
    Songs toDomain(SongsEntity entity);

    List<Songs> toDomainList(List<SongsEntity> entities);

    SongsResponseDto toResponseDto(Songs domain);

    List<SongsResponseDto> toResponseDtoList(List<Songs> domain);
}
