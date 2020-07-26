package com.digitaldags.tryhardcleanarchitecture.component.song.gateway;

import com.digitaldags.tryhardcleanarchitecture.component.song.model.domain.Song;

import java.util.List;

public interface SongGateway {
    List<Song> getAllSongs();

    Song getSong(Long id) throws Exception;

    Song saveSong(Song song);

    Song update(Long id, Song song);

    void delete(Long id);
}
