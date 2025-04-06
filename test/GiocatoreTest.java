import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.giocatore.Borsa;
import it.uniroma3.diadia.giocatore.Giocatore;

public class GiocatoreTest {
	Giocatore giocatore;
	Borsa borsa;

	@Before
	public void setUp() {
		giocatore = new Giocatore();
		borsa = new Borsa();
	}

	@Test
	public void testGetCfu() {
		assertEquals(20, giocatore.getCfu());

	}

	@Test
	public void testSetCfu() {
		giocatore.setCfu(15);
		assertEquals(15, giocatore.getCfu());

	}

	@Test
	public void testGetBorsa() {
		assertNotNull(giocatore.getBorsa());
	}

	@Test
	public void testSetBorsa() {
		giocatore.setBorsa(borsa);
		assertEquals(borsa, giocatore.getBorsa());
	}
}