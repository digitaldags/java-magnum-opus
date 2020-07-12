package com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.service;

import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.request.SongRequestDto;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.response.SongsResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SongsService {
    List<SongsResponseDto> getAll();

    SongsResponseDto getSong(Long id);

    ResponseEntity<?> addSong(SongRequestDto dto);

    SongsResponseDto updateSong(Long id, SongRequestDto dto);

    ResponseEntity<?> deleteSong(Long id);
}
