package com.digitaldags.tryhardcleanarchitecture.entrypoint.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.songs.gateway.SongsGateway;
import com.digitaldags.tryhardcleanarchitecture.component.songs.model.domain.Songs;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase.UpdateSong;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase.UpdateSongImpl;
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
    private SongsGateway gateway;

    private Songs song;

    private Songs correctedTypo;

    @Before
    public void setUp() {
        song = new Songs(1L, "Nandemonaiya", "RADWIMPS", "Kimi NoNawa OST");
        correctedTypo = new Songs(1L, "Nandemonaiya", "RADWIMPS", "Kimi No Nawa OST");
        updateSong = new UpdateSongImpl(gateway);
    }

    @Test
    public void execute_updateSong_returnsUpdatedSong() throws Exception {
        when(gateway.update(1L, correctedTypo)).thenReturn(correctedTypo);
        Songs updatedSong = updateSong.execute(1L, correctedTypo);
        assertThat(updatedSong).isEqualTo(correctedTypo);
    }
}
