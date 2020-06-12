package com.digitaldags.tryhardcleanarchitecture.component.songs.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Songs {
    private String title;
    private String artist;
    private String album;
}
