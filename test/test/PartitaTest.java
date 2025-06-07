

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

public class PartitaTest {

    Partita partita = new Partita(null);
    Stanza stanza = new Stanza("Stanza");

    @Test
    public void testIsFinitaConPartitaNonFinita() {
        assertFalse(partita.isFinita());
    }

    @Test
    public void testIsFinitaConPartitaFinita() {
        partita.setFinita();
        assertTrue(partita.isFinita());
    }

    @Test
    public void testIsFinitaConCfuFiniti() {
        partita.getGiocatore().setCfu(0);
        assertTrue(partita.isFinita());
    }

    @Test
    public void testVintaConPartitaNonVinta() {
        assertFalse(partita.vinta());
    }

    @Test
    public void testVintaConPartitaVinta() {
        Stanza stanzaVincente = partita.getLabirinto().getStanzaVincente();
        partita.getLabirinto().setStanzaCorrente(stanzaVincente);
        assertTrue(partita.vinta());
    }

    @Test
    public void testGetStanzaVincente() {
        assertEquals("Biblioteca", partita.getLabirinto().getStanzaVincente().getNome());
    }

    @Test
    public void testSetStanzaCorrente() {
        partita.getLabirinto().setStanzaCorrente(stanza);
        assertEquals(stanza, partita.getLabirinto().getStanzaCorrente());
    }
}