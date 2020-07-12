package com.digitaldags.tryhardcleanarchitecture.entrypoint.usecase;

import com.digitaldags.tryhardcleanarchitecture.component.songs.gateway.SongsGateway;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase.DeleteSong;
import com.digitaldags.tryhardcleanarchitecture.entrypoint.songs.usecase.DeleteSongImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DeleteSongTest {
    private DeleteSong deleteSong;

    @Mock
    private SongsGateway gateway;

    @Before
    public void setUp() {
        deleteSong = new DeleteSongImpl(gateway);
    }

    @Test
    public void execute_deleteSong() throws Exception {
        deleteSong.execute(1L);
        // Todo - Delete Song Test
    }
}
