package isp.lab5.exercise5;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JungleTest {
    Jungle jungle;
    @Test
    public void JungleTest(){
        Herbivorous[] herbivorous = new Herbivorous[20];
        Carnivorous[] carnivorous = new Carnivorous[20];
        this.jungle = new Jungle(herbivorous, carnivorous);

    }
}
