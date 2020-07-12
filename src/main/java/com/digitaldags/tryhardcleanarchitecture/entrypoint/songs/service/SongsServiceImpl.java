package com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.service;

import com.digitaldags.tryhardcleanarchitecture.component.songs.mapper.AddSongsMapper;
import com.digitaldags.tryhardcleanarchitecture.component.songs.mapper.SongsMapper;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.domain.Songs;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.request.AddSongRequestDto;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.dto.response.SongsResponseDto;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase.AddSong;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase.GetSong;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase.GetSongs;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SongsServiceImpl implements SongsService {
    private final SongsMapper mapper;
    private final AddSongsMapper addSongsMapper;
    private final GetSongs getSongs;
    private final GetSong getSong;
    private final AddSong addSong;

    @Override
    public List<SongsResponseDto> getAll() {
        return mapper.toResponseDtoList(getSongs.execute());
    }

    @Override
    public SongsResponseDto getSong(Long id) {
        return mapper.toResponseDto(getSong.execute(id));
    }

    @Override
    public ResponseEntity<?> addSong(AddSongRequestDto dto) {
        Songs song = addSong.execute(addSongsMapper.toDomain(dto));
        return ResponseEntity.ok(addSongsMapper.toResponse(song));
    }
}
