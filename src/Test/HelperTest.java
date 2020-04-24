package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
 
import Model.Coche;
import Operaciones.Helper;

class HelperTest {
	Helper h= new Helper();
	
	@Test
	void testEstadoCoche() {
		Coche c =new Coche("Ford","Fiesta","1111AAA", "azul", 0, 22000);
		
		h.estadoCoche(c);
		assertEquals("Es un coche nuevo", c.getEstado());
	}

	/*@Test
	void testTiene() {
	
		
	}*/

}
