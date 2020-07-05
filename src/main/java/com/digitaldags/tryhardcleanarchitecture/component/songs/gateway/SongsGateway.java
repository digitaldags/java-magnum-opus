package com.digitaldags.tryhardcleanarchitecture.component.songs.gateway;

import com.digitaldags.tryhardcleanarchitecture.component.songs.model.domain.Songs;

import java.util.List;

public interface SongsGateway {
    List<Songs> getAllSongs();

    Songs saveSong(Songs song);
}
