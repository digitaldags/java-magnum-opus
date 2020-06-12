package com.digitaldags.tryhardcleanarchitecture.component.songs.repository;

import com.digitaldags.tryhardcleanarchitecture.component.songs.model.entity.SongsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongsRepository extends JpaRepository<SongsEntity, String> {

}
