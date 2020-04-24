package Model;

public class Coche {
	private String marca, modelo, matricula,  estado;
	private int km, coste;
	
	
	public Coche(){};
	
	public Coche(String marca, String modelo, String matricula, int km, int coste){
		this.marca=marca;
		this.modelo=modelo;
		this.matricula=matricula;
		this.km=km;
		this.coste=coste;
		
		if(km==0) estado="Nuevo";
			else estado="Antiguo";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	};
	
		
}
