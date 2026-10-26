package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

```
@Test
void testFactorialOfZero() {
    assertEquals(1, Factorial.calculate(0));
}

@Test
void testFactorialOfOne() {
    assertEquals(1, Factorial.calculate(1));
}

@Test
void testFactorialOfFive() {
    assertEquals(120, Factorial.calculate(5));
}

@Test
void testFactorialOfTen() {
    assertEquals(3628800, Factorial.calculate(10));
}

@Test
void testNegativeNumber() {
    assertThrows(
        IllegalArgumentException.class,
        () -> Factorial.calculate(-1)
    );
}
```

}
