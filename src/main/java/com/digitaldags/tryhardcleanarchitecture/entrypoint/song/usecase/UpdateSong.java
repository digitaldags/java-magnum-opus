package com.digitaldags.tryhardcleanarchitecture.entrypoint.song.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.song.model.domain.Song;

public interface UpdateSong {
    Song execute(Long id, Song song);
}
