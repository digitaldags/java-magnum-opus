package com.digitaldags.tryhardcleanarchitecture.component.songs.gateway;

import com.digitaldags.tryhardcleanarchitecture.component.songs.mapper.SongsMapper;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.domain.Songs;
import com.digitaldags.tryhardcleanarchitecture.component.songs.repository.SongsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SongsGatewayImpl implements SongsGateway {
    private final SongsRepository repository;
    private final SongsMapper mapper;

    @Override
    public List<Songs> getAllSongs() {
        return mapper.toDomainList(repository.findAll());
    }
}
