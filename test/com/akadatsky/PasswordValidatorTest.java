package com.akadatsky;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void isValid() {
        assertFalse(PasswordValidator.isValid(null));
        assertFalse(PasswordValidator.isValid("1234567"));
        assertTrue(PasswordValidator.isValid("12345678"));
    }

}