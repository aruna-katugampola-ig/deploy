package com.example.deploy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class VersionTest {

    Version version;

    @Test
    public void testGetVersion() {
        // given
        version = new Version();
        // when
        String thisVersion = version.getVersion();
        assertNotNull(thisVersion);
        assertNotEquals("", thisVersion);
    }
}
