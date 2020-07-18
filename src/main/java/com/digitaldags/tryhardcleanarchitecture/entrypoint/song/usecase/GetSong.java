package com.digitaldags.tryhardcleanarchitecture.entrypoint.song.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.song.model.domain.Song;

public interface GetSong {
    Song execute(Long id);
}
