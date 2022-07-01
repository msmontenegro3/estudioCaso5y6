package EstudioCaso5y6;

public class DocenteHoras extends Docente {
	
	private int horasTrabajadas;
	private double sueldoPorHoras;

	public DocenteHoras(String nombre, double salario, int horasTrabajadas) {
		super(nombre, salario);
		this.horasTrabajadas=horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	

	//métodos propios
	public void calcularSueldo() {
		this.sueldoPorHoras = super.salario*horasTrabajadas;
	}
	
	public double dameSueldo() {
		return sueldoPorHoras;
	} //fin método dameSueldo
	
	//Método toString
	public String toString() {
		return "\nNombre Docente: " + getNombre() + "\nValor de hora: " + 
		getSalario()+ "\nHoras trabajadas: " + getHorasTrabajadas() + "\nTotal: " + dameSueldo();
	}//fin método toString
}
