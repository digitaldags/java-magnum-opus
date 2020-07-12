package com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.songs.gateway.SongsGateway;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.domain.Songs;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateSongImpl implements UpdateSong {
    private final SongsGateway gateway;

    @Override
    public Songs execute(Long id, Songs song) {
        return gateway.update(id, song);
    }
}