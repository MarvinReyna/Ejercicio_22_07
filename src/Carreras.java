
public class Carreras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pista malasia = new Pista();
		malasia.setIdentificador(1);
		malasia.setLongitud(5.5f);
		malasia.setNombre("Malasi");
		Carro f1 = new Carro(5);
		f1.setIdentificador(1);
		f1.setModelo("2023");
		f1.setNombre("Ferrari");
		f1.setVueltas(malasia);
		System.out.print(f1.getVelocidad());
	}

}
