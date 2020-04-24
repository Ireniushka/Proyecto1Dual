package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Cuenta;
import Logic.operaciones;

class operacionesTest {
	Cuenta cta = new Cuenta("Juan Rodriguez", "48462379-Y", "ES00168234186", 1663);
	
	@Test
	void testIngreso() {
		assertEquals(1763,operaciones.ingreso(cta,100));
	}

	@Test
	void testRetiro() {
		assertEquals(1563,operaciones.retiro(cta,100));
	}

}
