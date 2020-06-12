package com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.controller;

import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.SongsResponseDto;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.service.SongsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
