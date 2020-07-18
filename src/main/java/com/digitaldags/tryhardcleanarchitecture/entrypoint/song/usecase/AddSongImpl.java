package com.digitaldags.tryhardcleanarchitecture.entrypoint.song.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.song.gateway.SongGateway;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.domain.Song;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddSongImpl implements AddSong {
    private final SongGateway gateway;

    @Override
    public Song execute(Song song) {
        return gateway.saveSong(song);
    }
}
