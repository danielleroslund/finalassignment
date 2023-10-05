package com.example.finalassignment.EnhetsTest;

import com.example.finalassignment.Respons;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResponsTest {

    @Test
    public void testResponseCall() {
        Respons resp = new Respons("Anna");
        assertEquals("Hello, Anna", resp.getRespons());
    }
}
