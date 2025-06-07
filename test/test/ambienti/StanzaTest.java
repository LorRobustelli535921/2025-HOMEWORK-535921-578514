package ambienti;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest {
	
	// Creazione di una stanza
	Stanza stanza = new Stanza("Stanza Test");
	// Creazione di un attrezzo
	Attrezzo attrezzo = new Attrezzo("Nuovo Attrezzo", 1);
	@Test
	public void testAddAttrezzoConStanzaVuota() {
		boolean aggiunto = stanza.addAttrezzo(attrezzo);
		assertTrue(aggiunto);
	}
	
	@Test
	public void testGetStanzaAdiacenteVuota() {
		assertNull(stanza.getStanzaAdiacente("sud"));
	}
	
	@Test
	public void testGetStanzaAdiacenteImpostata() {
		Stanza stanzaAdiacente = new Stanza("Stanza Adiacente");
		stanza.impostaStanzaAdiacente("nord", stanzaAdiacente);
		assertNotNull(stanza.getStanzaAdiacente("nord"));
	}
	
	@Test
	public void testImpostaStanzaAdiacenteCasoPositivo() {
		Stanza stanzaAdiacente = new Stanza("Stanza Adiacente");
		String direzione = "sud"; 
		stanza.impostaStanzaAdiacente(direzione, stanzaAdiacente);
		assertEquals(stanzaAdiacente, stanza.getStanzaAdiacente(direzione));
	}
	
	@Test
	public void testImpostaStanzaAdiacenteVuota() {
		Stanza stanzaAdiacente = null;
		stanza.impostaStanzaAdiacente("sud", stanzaAdiacente);
		assertNull(stanza.getStanzaAdiacente("sud"));
	}
	
	
}
