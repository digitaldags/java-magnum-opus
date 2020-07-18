package com.digitaldags.tryhardcleanarchitecture.entrypoint.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.song.gateway.SongGateway;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.domain.Song;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.song.usecase.GetSong;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.song.usecase.GetSongImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GetSongTest {
    private GetSong getSong;

    @Mock
    private SongGateway gateway;

    private ArrayList<Song> songs = new ArrayList<>();

    private Song song;

    @Before
    public void setUp() {
        songs.add(new Song(1L, "Nandemonaiya", "RADWIMPS", "Kimi No Nawa OST"));
        songs.add(new Song(2L, "Voices of Wind", "RADWIMPS", "Weathering With You OST"));
        song = songs.stream()
                .findFirst()
                .get();
        getSong = new GetSongImpl(gateway);
    }

    @Test
    public void execute_getSong_returnsSong() throws Exception {
        when(gateway.getSong(anyLong())).thenReturn(song);
        Song nandemonaiya = getSong.execute(1L);
        assertThat(nandemonaiya).isEqualTo(new Song(1L, "Nandemonaiya", "RADWIMPS", "Kimi No Nawa OST"));
    }
}
