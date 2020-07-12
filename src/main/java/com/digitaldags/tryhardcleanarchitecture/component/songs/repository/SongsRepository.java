package com.digitaldags.tryhardcleanarchitecture.component.songs.repository;

import com.digitaldags.tryhardcleanarchitecture.component.songs.model.entity.SongsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface SongsRepository extends JpaRepository<SongsEntity, Long> {
    @Transactional
    @Modifying
    @Query("update SongsEntity set title = :title, artist = :artist, album = :album where id = :id")
    void update(
            @Param("id") Long id,
            @Param("title") String title,
            @Param("artist") String artist,
            @Param("album") String album
    );
}
