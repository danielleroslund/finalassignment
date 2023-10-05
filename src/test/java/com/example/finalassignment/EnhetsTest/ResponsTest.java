package com.example.finalassignment.EnhetsTest;

import com.example.finalassignment.Respons;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResponsTest {

    @Test
    public void testResponseCall() {
        Respons resp = new Respons("Agnes");
        assertEquals("Hello, Agnes", resp.getRespons());
    }
}
