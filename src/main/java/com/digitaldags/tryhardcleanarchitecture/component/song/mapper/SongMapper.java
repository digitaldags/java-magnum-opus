package com.digitaldags.tryhardcleanarchitecture.component.song.mapper;

import com.digitaldags.tryhardcleanarchitecture.component.song.model.domain.Song;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.dto.response.SongResponseDto;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.entity.SongEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SongMapper {
    Song toDomain(SongEntity entity);

    List<Song> toDomainList(List<SongEntity> entities);

    SongResponseDto toResponseDto(Song domain);

    List<SongResponseDto> toResponseDtoList(List<Song> domain);
}
