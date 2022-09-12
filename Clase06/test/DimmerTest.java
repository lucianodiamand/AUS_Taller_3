import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DimmerTest {

	private Dimmer d;

	@BeforeEach
	void init () {
        d = new Dimmer();		
	}

	@Test
	void testAlPrenderSePrende() {
		// Act
		d.on();
		// Assert
		assertTrue(d.isPrendida());
	}

	@Test
	void testAlApagarSeApaga() {
		// Act
		d.on();
		d.off();
		// Assert
		assertFalse(d.isPrendida());
	}

	@Test
	void testElDimmerSeCreaApagada() {
		assertFalse(d.isPrendida());
	}

	@Test
	void testDimmerConIntensidadEnUnoDebePrender() {
		d.inc();
		assertTrue(d.isPrendida());
	}

	@Test
	void testDimmerSeEnciendeLaIntensidadEsUno() {
        d.on();
        assertEquals(1, d.getIntensidad());
	}

	@Test
	void testIncrementoDimmer5VecesIntensidadEn5() {
		d.inc();
		d.inc();
		d.inc();
		d.inc();
		d.inc();
		assertEquals(5, d.getIntensidad());
	}

	@Test
	void testCreaDimmerPrendido() {
		d = new Dimmer(true);
		assertTrue(d.isPrendida());
	}

}
