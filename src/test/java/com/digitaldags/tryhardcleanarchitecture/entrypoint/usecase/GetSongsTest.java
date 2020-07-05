package com.digitaldags.tryhardcleanarchitecture.entrypoint.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.songs.gateway.SongsGateway;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.domain.Songs;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase.GetSongs;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase.GetSongsImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GetSongsTest {
    private GetSongs getSongs;

    @Mock
    private SongsGateway gateway;

    private ArrayList<Songs> songs = new ArrayList<>();

    @Before
    public void setUp() {
        songs.add(new Songs("Nandemonaiya", "RADWIMPS", "Kimi No Nawa OST"));
        getSongs = new GetSongsImpl(gateway);
    }

    @Test
    public void execute_getSongs_returnsListOfSongs() throws Exception {
        when(gateway.getAllSongs()).thenReturn(songs);
        List<Songs> songsList = getSongs.execute();
        assertThat(songsList).isNotNull();
    }
}
