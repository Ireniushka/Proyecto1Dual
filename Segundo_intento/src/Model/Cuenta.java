package Model;

public class Cuenta {
	private String titular, dni, numCuenta;
	private int saldo;
	
	public Cuenta() {};
	
	public Cuenta(String titular,String dni,String numCuenta, int saldo) {
		this.titular=titular;
		this.dni=dni;
		this.numCuenta=numCuenta;
		this.saldo=saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	};
	
	
	
}
