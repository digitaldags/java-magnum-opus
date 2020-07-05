package com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.controller;

import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.AddSongRequestDto;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.SongsResponseDto;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.service.SongsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
@RequiredArgsConstructor
public class SongsController {
    private final SongsService service;

    @GetMapping
    List<SongsResponseDto> getAllSongs() {
        return service.getAll();
    }

    @GetMapping(value = "/{id}")
    SongsResponseDto getSong(@PathVariable Long id) {
        return service.getSong(id);
    }

    @PostMapping
    public ResponseEntity<?> saveSong(@RequestBody AddSongRequestDto requestDto) {
        return ResponseEntity.ok(service.addSong(requestDto));
    }
}
