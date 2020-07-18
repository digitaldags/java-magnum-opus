package com.digitaldags.tryhardcleanarchitecture.entrypoint.song.service;

import com.digitaldags.tryhardcleanarchitecture.component.song.model.dto.request.SongRequestDto;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.dto.response.SongResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SongService {
    List<SongResponseDto> getAll();

    SongResponseDto getSong(Long id);

    ResponseEntity<?> addSong(SongRequestDto dto);

    SongResponseDto updateSong(Long id, SongRequestDto dto);

    ResponseEntity<?> deleteSong(Long id);
}
