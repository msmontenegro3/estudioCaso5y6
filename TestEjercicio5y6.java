package EstudioCaso5y6;
public class TestEjercicio5y6 {

	public static void main(String[] args) {
		
		//Se instancia la clase DocenteHoras
		DocenteHoras dHoras = new DocenteHoras("Mirta Montenegro", 5, 20);

		dHoras.calcularSueldo();
		
		//Se instancia la clase DocenteContrato
		DocenteContrato dContrato = new DocenteContrato("Sofía Lescano", 600);
		
		dContrato.calcularSueldo();
		
		//Imprime la representación string de las clases Perro y Gato
		System.out.println("----------------------------------");
		System.out.println("Datos completos");
		System.out.println("----------------------------------");
		System.out.println(dHoras);
		System.out.println(dContrato);
		

	}

}
