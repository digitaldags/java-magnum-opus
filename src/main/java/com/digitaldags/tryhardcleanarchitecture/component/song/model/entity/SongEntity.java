package com.digitaldags.tryhardcleanarchitecture.component.song.model.entity;

import com.digitaldags.tryhardcleanarchitecture.component.common.model.entity.BaseEntity;
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
public class SongEntity extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String artist;
    private String album;
}
