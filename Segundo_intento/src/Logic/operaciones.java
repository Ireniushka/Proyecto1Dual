package Logic;

import Model.Cuenta;

public class operaciones {
	
	public static int ingreso(Cuenta c, int cant) {
		c.setSaldo(c.getSaldo()+cant);
		return c.getSaldo();
	}
	
	public static int retiro(Cuenta c, int cant) {
		c.setSaldo(c.getSaldo()-cant);
		return c.getSaldo();
	}
	
	
}
