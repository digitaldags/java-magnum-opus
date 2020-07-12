package com.digitaldags.tryhardcleanarchitecture.component.songs.mapper;

import com.digitaldags.tryhardcleanarchitecture.component.songs.model.domain.Songs;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.request.AddSongRequestDto;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.response.SongsResponseDto;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.entity.SongsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AddSongsMapper {
    SongsEntity toEntity(Songs song);

    @Mapping(ignore = true, target = "id")
    Songs toDomain(AddSongRequestDto song);

    SongsResponseDto toResponse(Songs song);
}
