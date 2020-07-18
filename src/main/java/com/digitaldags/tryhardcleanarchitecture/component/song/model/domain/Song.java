package com.digitaldags.tryhardcleanarchitecture.component.song.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Song {
    private Long id;
    private String title;
    private String artist;
    private String album;
}
