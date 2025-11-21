package org.yourcompany.yourproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class testSuperCalculadora {
@Test

public void test1() {

    assertEquals(3,SuperCalculadora.nombreDigits(123));
    assertEquals(2,SuperCalculadora.nombreDigits(12));
    assertEquals(4,SuperCalculadora.nombreDigits(1223));
    assertEquals(1,SuperCalculadora.nombreDigits(1));
    assertEquals(5,SuperCalculadora.nombreDigits(12345));
}
}