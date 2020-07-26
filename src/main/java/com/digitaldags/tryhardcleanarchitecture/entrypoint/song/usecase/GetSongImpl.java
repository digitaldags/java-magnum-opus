package com.digitaldags.tryhardcleanarchitecture.entrypoint.song.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.song.gateway.SongGateway;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.domain.Song;
import com.digitaldags.tryhardcleanarchitecture.exception.song.SongException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetSongImpl implements GetSong {
    private final SongGateway gateway;

    @Override
    public Song execute(Long id) throws SongException {
        try {
            return gateway.getSong(id);
        } catch (Exception e) {
            throw new SongException("Song not found.");
        }
    }
}
