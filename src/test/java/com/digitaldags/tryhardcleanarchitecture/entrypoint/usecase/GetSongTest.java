package com.digitaldags.tryhardcleanarchitecture.entrypoint.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.songs.gateway.SongsGateway;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.domain.Songs;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase.GetSong;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase.GetSongImpl;
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
    private SongsGateway gateway;

    private ArrayList<Songs> songs = new ArrayList<>();

    private Songs song;

    @Before
    public void setUp() {
        songs.add(new Songs(1L, "Nandemonaiya", "RADWIMPS", "Kimi No Nawa OST"));
        songs.add(new Songs(2L, "Voices of Wind", "RADWIMPS", "Weathering With You OST"));
        song = songs.stream()
                .findFirst()
                .get();
        getSong = new GetSongImpl(gateway);
    }

    @Test
    public void execute_getSong_returnsSong() throws Exception {
        when(gateway.getSong(anyLong())).thenReturn(song);
        Songs nandemonaiya = getSong.execute(1L);
        assertThat(nandemonaiya).isEqualTo(new Songs(1L, "Nandemonaiya", "RADWIMPS", "Kimi No Nawa OST"));
    }
}
