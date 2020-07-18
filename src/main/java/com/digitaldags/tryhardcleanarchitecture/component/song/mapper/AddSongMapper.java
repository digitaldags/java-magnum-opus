package com.digitaldags.tryhardcleanarchitecture.component.song.mapper;

import com.digitaldags.tryhardcleanarchitecture.component.song.model.domain.Song;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.dto.request.SongRequestDto;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.dto.response.SongResponseDto;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.entity.SongEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddSongMapper {
    SongEntity toEntity(Song song);

    @Mapping(ignore = true, target = "id")
    Song toDomain(SongRequestDto song);

    SongResponseDto toResponse(Song song);
}