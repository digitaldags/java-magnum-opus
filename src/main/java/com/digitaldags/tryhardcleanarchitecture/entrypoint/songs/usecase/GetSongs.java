package com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.songs.model.domain.Songs;

import java.util.List;

public interface GetSongs {
    List<Songs> execute();
}
