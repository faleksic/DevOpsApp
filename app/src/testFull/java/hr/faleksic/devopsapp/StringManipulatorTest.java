package hr.faleksic.devopsapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringManipulatorTest {
    @Test
    public void validateConvertToReverseUpperCase() {
        assertEquals("THIS IS A TEST", StringManipulator.convertToReverseUpperCase("tset a si siht"));
    }
}
