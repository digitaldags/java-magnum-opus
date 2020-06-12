package com.digitaldags.tryhardcleanarchitecture.component.songs.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DD_SONGS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SongsEntity {
    @Id
    private Long id;
    private String title;
    private String artist;
    private String album;
}
