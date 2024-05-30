package testJunit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import scool.PhoneNumber;

class PhoneNumberTest {
	PhoneNumber telefono;

	@Test
	void testComprobarNumeroBien() {
		boolean result = telefono.chekNumber("123457890");
		assertEquals(result, true);

	}

	@Test
	void testComprobarNumeroMal() {
		boolean result = telefono.chekNumber("12345789!");
		assertEquals(result, false);

	}
}
