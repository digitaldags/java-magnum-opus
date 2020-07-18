package com.digitaldags.tryhardcleanarchitecture.entrypoint.song.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.song.gateway.SongGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteSongImpl implements DeleteSong {
    private final SongGateway gateway;

    @Override
    public void execute(Long id) {
        gateway.delete(id);
    }
}
