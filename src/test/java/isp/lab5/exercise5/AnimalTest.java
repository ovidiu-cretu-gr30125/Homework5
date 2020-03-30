package isp.lab5.exercise5;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    @Test
    public void eatTest() {
        Tiger tiger1 = new Tiger("1", 20);
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        tiger1.eat();
        assertEquals("Tiger{meat}\r\n",outContent.toString());
    }
}
