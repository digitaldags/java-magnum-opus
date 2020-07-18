package com.digitaldags.tryhardcleanarchitecture.entrypoint.song.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.song.model.domain.Song;

import java.util.List;

public interface GetSongs {
    List<Song> execute();
}
