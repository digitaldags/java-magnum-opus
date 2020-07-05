package com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.service;

import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.AddSongRequestDto;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.SongsResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SongsService {
    List<SongsResponseDto> getAll();

    SongsResponseDto getSong(Long id);

    ResponseEntity<?> addSong(AddSongRequestDto dto);
}
