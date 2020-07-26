package com.digitaldags.tryhardcleanarchitecture.entrypoint.song.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.song.model.domain.Song;
import com.digitaldags.tryhardcleanarchitecture.exception.song.SongException;

public interface GetSong {
    Song execute(Long id) throws SongException;
}
