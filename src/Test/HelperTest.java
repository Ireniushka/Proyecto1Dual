package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
 
import Model.Coche;
import Logic.Helper;

class HelperTest {
	Helper h= new Helper();
	Coche c =new Coche("Ford","Fiesta","1111AAA", "azul", 0, 22000);
	
	
	@Test
	void testEstadoCoche() {
		assertEquals("Es un coche nuevo", h.estadoCoche(c));
	}

	@Test
	void testTiene() {
		assertEquals("sin ", h.tiene(c.isRemolque()));
	}

}
