package soundsystem;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.config.EnvironmentConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EnvironmentConfig.class)
public class EnvTest {

    @Autowired
    private BlankDisc blankDisc;

    @Test
    public void assertBlankDiscProperties() {
        assertEquals("The Beatles", blankDisc.getArtist());
        assertEquals("Sgt. Peppers Lonely Hearts Club Band", blankDisc.getTitle());
    }
}