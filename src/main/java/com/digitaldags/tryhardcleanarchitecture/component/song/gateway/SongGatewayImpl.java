package com.digitaldags.tryhardcleanarchitecture.component.song.gateway;

import com.digitaldags.tryhardcleanarchitecture.component.song.mapper.AddSongMapper;
import com.digitaldags.tryhardcleanarchitecture.component.song.mapper.SongMapper;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.domain.Song;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.entity.SongEntity;
import com.digitaldags.tryhardcleanarchitecture.component.song.repository.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SongGatewayImpl implements SongGateway {
    private final SongRepository repository;
    private final SongMapper mapper;
    private final AddSongMapper addSongMapper;

    @Override
    public List<Song> getAllSongs() {
        return mapper.toDomainList(repository.findAll());
    }

    @Override
    public Song getSong(Long id) throws Exception {
        try {
            SongEntity entity = repository.getOne(id);
            return mapper.toDomain(entity);
        } catch (Exception e) {
            throw new Exception();
        }
    }

    @Override
    public Song saveSong(Song song) {
        SongEntity entity = repository.save(addSongMapper.toEntity(song));
        return mapper.toDomain(entity);
    }

    @Override
    public Song update(Long id, Song song) {
        repository.update(id, song.getTitle(), song.getArtist(), song.getAlbum());
        return mapper.toDomain(repository.getOne(id));
    }

    @Override
    public void delete(Long id) {
        repository.delete(repository.getOne(id));
    }
}
