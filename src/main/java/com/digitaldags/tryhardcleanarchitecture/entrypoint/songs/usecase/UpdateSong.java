package com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.songs.model.domain.Songs;

public interface UpdateSong {
    Songs execute(Long id, Songs song);
}
