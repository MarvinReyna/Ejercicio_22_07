
public class Carro {
	private int identificador;
	private String modelo;
	private String nombre;
	private Vuelta[] vueltas;
	private int numero_vueltas;
	
	Carro(){
		identificador = 0;
		modelo = "";
		nombre = "";
		vueltas = new Vuelta[0];
		numero_vueltas = 0;
	}
	Carro(int numero_vueltas) {
		identificador = 0;
		modelo = "";
		nombre = "";
		vueltas = new Vuelta[numero_vueltas];
	}
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void getVelocidad() {
		float total = 0;
		for (int i = 0;i < numero_vueltas;i++) {
			total = total + vueltas[i].getVelocidad();
			
		}
		return total/numero_vueltas;
		
	}
	public void setVueltas(Pista p){
		for(int i = 0;i < numero_vueltas;i++);
		vueltas[i].setPista(p);
		
		
	}
}