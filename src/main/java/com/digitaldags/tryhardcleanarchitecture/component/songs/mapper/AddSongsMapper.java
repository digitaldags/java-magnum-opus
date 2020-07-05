package com.digitaldags.tryhardcleanarchitecture.component.songs.mapper;

import com.digitaldags.tryhardcleanarchitecture.component.songs.model.domain.Songs;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.AddSongRequestDto;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.SongsResponseDto;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.entity.SongsEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddSongsMapper {
    SongsEntity toEntity(Songs song);

    Songs toDomain(AddSongRequestDto song);

    SongsResponseDto toResponse(Songs song);
}
