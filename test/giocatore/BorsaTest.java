package giocatore;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class BorsaTest {

    Borsa borsa;
    Attrezzo piccone;
    Attrezzo martello;
    @Before
    public void setUp() {
        borsa = new Borsa();
        piccone = new Attrezzo("Piccone",7);
        martello = new Attrezzo("Martello",20);
        
    }
    @Test
    public void testGetAttrezzoTrovato() {
    	Attrezzo AttrezzoDaCercare= new Attrezzo("Attrezzo da cercare", 1);
    	borsa.addAttrezzo(AttrezzoDaCercare);
    	assertEquals(AttrezzoDaCercare, borsa.getAttrezzo("Attrezzo da cercare"));
    }
    @Test
    public void testGetAttrezzoNonTrovato() {
    	borsa.addAttrezzo(piccone);
    	Attrezzo AttrezzoDaCercare= new Attrezzo("Attrezzo da cercare", 1);
    	assertNotEquals(AttrezzoDaCercare, borsa.getAttrezzo("Piccone"));
    }
    @Test
    public void testAddAttrezzoNull() {
    	piccone = null;
    	assertFalse(borsa.addAttrezzo(piccone));
    }
    
    @Test
    public void testAddAttrezzoPesoMaggiore() {
    	assertFalse(borsa.addAttrezzo(martello));
    }
    @Test
    public void testAddAttrezzoPesoMinore() {
    	assertTrue(borsa.addAttrezzo(piccone));
    }
    @Test 
    public void testRemoveAttrezzoPositivo() {
    	borsa.addAttrezzo(piccone);
    	assertEquals(piccone, borsa.removeAttrezzo("Piccone"));
    }
    @Test 
    public void testRemoveAttrezzoNegativo() {
    	assertNotEquals(piccone, borsa.removeAttrezzo("Piccone"));
    }
    @Test
    public void TestGetPeso() {
    	assertEquals(7, piccone.getPeso());
    }
    @Test
    public void TestGetPesoSbagliato() {
    	assertNotEquals(10, piccone.getPeso());
    }
    
}
