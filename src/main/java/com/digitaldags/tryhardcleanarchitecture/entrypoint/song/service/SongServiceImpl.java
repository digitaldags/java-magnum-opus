package com.digitaldags.tryhardcleanarchitecture.entrypoint.song.service;

import com.digitaldags.tryhardcleanarchitecture.component.song.mapper.AddSongMapper;
import com.digitaldags.tryhardcleanarchitecture.component.song.mapper.SongMapper;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.domain.Song;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.dto.request.SongRequestDto;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.dto.response.SongResponseDto;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.song.usecase.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SongServiceImpl implements SongService {
    private final SongMapper mapper;
    private final AddSongMapper addSongMapper;
    private final GetSongs getSongs;
    private final GetSong getSong;
    private final AddSong addSong;
    private final UpdateSong updateSong;
    private final DeleteSong deleteSong;

    @Override
    public List<SongResponseDto> getAll() {
        return mapper.toResponseDtoList(getSongs.execute());
    }

    @Override
    public SongResponseDto getSong(Long id) {
        return mapper.toResponseDto(getSong.execute(id));
    }

    @Override
    public ResponseEntity<?> addSong(SongRequestDto dto) {
        Song song = addSong.execute(addSongMapper.toDomain(dto));
        return ResponseEntity.ok(addSongMapper.toResponse(song));
    }

    @Override
    public SongResponseDto updateSong(Long id, SongRequestDto dto) {
        return mapper.toResponseDto(updateSong.execute(id, addSongMapper.toDomain(dto)));
    }

    @Override
    public ResponseEntity<?> deleteSong(Long id) {
        deleteSong.execute(id);
        return ResponseEntity.ok("Song Successfully Removed!");
    }
}
