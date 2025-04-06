import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;

public class LabirintoTest {
    private Labirinto labirinto;

    @Before
    public void setUp() {
        labirinto = new Labirinto();
        labirinto.creaStanze();
        
    }

    @Test
    public void testGetStanzaVincente() {
        Stanza biblioteca = new Stanza("Biblioteca");
        assertEquals(biblioteca.getNome(), labirinto.getStanzaVincente().getNome());
    }
    @Test
    public void testGetStanzaVincenteNegativo() {
        Stanza DS1 = new Stanza("DS1");
        assertNotEquals(DS1.getNome(), labirinto.getStanzaVincente().getNome());
    }

    @Test
    public void testSetStanzaCorrente() {
        Stanza DS1 = new Stanza("DS1");
        labirinto.setStanzaCorrente(DS1);
        assertEquals(DS1.getNome(), labirinto.getStanzaCorrente().getNome());
    }

    @Test
    public void testGetStanzaCorrente() {
        Stanza atrio = new Stanza("Atrio");
        assertEquals(atrio.getNome(), labirinto.getStanzaCorrente().getNome());
    }
}
