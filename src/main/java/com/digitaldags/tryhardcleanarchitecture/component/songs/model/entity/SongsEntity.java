package com.digitaldags.tryhardcleanarchitecture.component.songs.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DD_SONGS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
public class SongsEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String artist;
    private String album;
}
