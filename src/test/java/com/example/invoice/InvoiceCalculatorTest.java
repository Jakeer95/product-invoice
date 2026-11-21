package com.example.invoice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class InvoiceCalculatorTest {

InvoiceCalculator calculator = new InvoiceCalculator();

@Test
void testProductAmount() {
    assertEquals(5000, calculator.calculateProductAmount(2500, 2));
}

@Test
void testTenPercentDiscount() {
    assertEquals(500, calculator.calculateDiscount(5000));
}

@Test
void testFivePercentDiscount() {
    assertEquals(150, calculator.calculateDiscount(3000));
}

@Test
void testNoDiscount() {
    assertEquals(0, calculator.calculateDiscount(1000));
}

@Test
void testGST() {
    assertEquals(180, calculator.calculateGST(1000));
}

@Test
void testFinalAmount() {
    assertEquals(5310, calculator.calculateFinalAmount(5000));
}

}
