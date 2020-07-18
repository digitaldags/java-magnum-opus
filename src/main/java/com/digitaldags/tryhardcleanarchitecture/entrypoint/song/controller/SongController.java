package com.digitaldags.tryhardcleanarchitecture.entrypoint.song.controller;

import com.digitaldags.tryhardcleanarchitecture.component.song.model.dto.request.SongRequestDto;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.dto.response.SongResponseDto;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.song.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
@RequiredArgsConstructor
public class SongController {
    private final SongService service;

    @GetMapping
    List<SongResponseDto> getAllSongs() {
        return service.getAll();
    }

    @GetMapping(value = "/{id}")
    SongResponseDto getSong(@PathVariable Long id) {
        return service.getSong(id);
    }

    @PostMapping
    public ResponseEntity<?> saveSong(@RequestBody SongRequestDto requestDto) {
        return ResponseEntity.ok(service.addSong(requestDto));
    }

    @PutMapping(value = "/{id}")
    SongResponseDto updateSong(@PathVariable Long id, @RequestBody SongRequestDto dto) {
        return service.updateSong(id, dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteSong(@PathVariable Long id) {
        return ResponseEntity.ok(service.deleteSong(id));
    }
}
