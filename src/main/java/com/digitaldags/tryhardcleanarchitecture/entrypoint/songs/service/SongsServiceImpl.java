package com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.service;

import com.digitaldags.tryhardcleanarchitecture.component.songs.mapper.SongsMapper;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.SongsResponseDto;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase.GetSongs;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SongsServiceImpl implements SongsService {
    private final GetSongs getSongs;
    private final SongsMapper mapper;

    @Override
    public List<SongsResponseDto> getAll() {
        return mapper.toResponseDtoList(getSongs.execute());
    }
}
