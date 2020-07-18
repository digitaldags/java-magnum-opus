package com.digitaldags.tryhardcleanarchitecture.entrypoint.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.song.gateway.SongGateway;
import com.digitaldags.tryhardcleanarchitecture.component.song.model.domain.Song;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.song.usecase.UpdateSong;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.song.usecase.UpdateSongImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UpdateSongTest {
    private UpdateSong updateSong;

    @Mock
    private SongGateway gateway;

    private Song song;

    private Song correctedTypo;

    @Before
    public void setUp() {
        song = new Song(1L, "Nandemonaiya", "RADWIMPS", "Kimi NoNawa OST");
        correctedTypo = new Song(1L, "Nandemonaiya", "RADWIMPS", "Kimi No Nawa OST");
        updateSong = new UpdateSongImpl(gateway);
    }

    @Test
    public void execute_updateSong_returnsUpdatedSong() throws Exception {
        when(gateway.update(1L, correctedTypo)).thenReturn(correctedTypo);
        Song updatedSong = updateSong.execute(1L, correctedTypo);
        assertThat(updatedSong).isEqualTo(correctedTypo);
    }
}
