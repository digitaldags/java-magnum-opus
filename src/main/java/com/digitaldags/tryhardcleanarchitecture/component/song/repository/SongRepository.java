package com.digitaldags.tryhardcleanarchitecture.component.song.repository;

import com.digitaldags.tryhardcleanarchitecture.component.song.model.entity.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface SongRepository extends JpaRepository<SongEntity, Long> {
    @Transactional
    @Modifying
    @Query("update SongEntity set title = :title, artist = :artist, album = :album where id = :id")
    void update(
            @Param("id") Long id,
            @Param("title") String title,
            @Param("artist") String artist,
            @Param("album") String album
    );
}
