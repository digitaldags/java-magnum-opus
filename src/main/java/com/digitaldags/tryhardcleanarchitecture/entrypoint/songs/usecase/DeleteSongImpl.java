package com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.songs.gateway.SongsGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteSongImpl implements DeleteSong {
    private final SongsGateway gateway;

    @Override
    public void execute(Long id) {
        gateway.delete(id);
    }
}
