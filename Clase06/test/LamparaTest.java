import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LamparaTest {

	private Lampara l;

	@BeforeEach
	void init() {
        l = new Lampara();
	}

	@Test
	void testAlPrenderSePrende() {
		// Act
		l.on();
		// Assert
		assertTrue(l.isPrendida());
	}

	@Test
	void testAlApagarSeApaga() {
		// Act
		l.on();
		l.off();
		// Assert
		assertFalse(l.isPrendida());
	}

	@Test
	void testLaLamparaSeCreaApagada() { 
		assertFalse(l.isPrendida());
	}

}
