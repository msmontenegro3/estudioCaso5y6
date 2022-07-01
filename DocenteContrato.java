package EstudioCaso5y6;

public class DocenteContrato extends Docente {
	
	//ATRIBUTOS
	private double sueldoContrato;
	
	//CONSTRUCTOR
	public DocenteContrato(String nombre, double salario) {
		super(nombre, salario);
	}
	
	//Métodos propios
	public void calcularSueldo() {
		sueldoContrato = super.salario-(super.salario*0.10);
	}//fin método calcularSueldo´
	
	public double dameSueldo() {
		double sueldo=sueldoContrato;
		return sueldo;
	}//fin método dameSueldo
	
	
	//Método toString
	public String toString() {
		return "\nNombre Docente: " + getNombre() + "\nSalario: " + getSalario() + "\nTotal: " + dameSueldo();
	}
	
	
	
	
}
