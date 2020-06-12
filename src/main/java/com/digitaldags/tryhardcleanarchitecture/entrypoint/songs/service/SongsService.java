package com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.service;

import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.SongsResponseDto;

import java.util.List;

public interface SongsService {
    List<SongsResponseDto> getAll();
}
