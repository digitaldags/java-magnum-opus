package com.digitaldags.tryhardcleanarchitecture.entrypoint.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.song.gateway.SongGateway;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.domain.Song;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.song.usecase.AddSong;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.song.usecase.AddSongImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AddSongTest {
    private AddSong addSong;

    @Mock
    private SongGateway gateway;

    Song song = new Song();

    @Before
    public void setUp() {
        song = new Song(1L, "Mambo No. 5", "Lou Bega", "A Little Bit of Mambo");
        addSong = new AddSongImpl(gateway);
    }

    @Test
    public void execute_addSongs_returnsSongAdded() throws Exception {
        when(gateway.saveSong(song)).thenReturn(song);
        Song addedSong = addSong.execute(song);
        assertThat(addedSong).isEqualTo(song);
    }
}
