package com.digitaldags.tryhardcleanarchitecture.entrypoint.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.songs.gateway.SongsGateway;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.domain.Songs;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase.AddSong;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase.AddSongImpl;
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
    private SongsGateway gateway;

    Songs song = new Songs();

    @Before
    public void setUp() {
        song = new Songs("Mambo No. 5", "Lou Bega", "A Little Bit of Mambo");
        addSong = new AddSongImpl(gateway);
    }

    @Test
    public void execute_addSongs_returnsSongAdded() throws Exception {
        when(gateway.saveSong(song)).thenReturn(song);
        Songs addedSong = addSong.execute(song);
        assertThat(addedSong).isEqualTo(song);
    }
}
