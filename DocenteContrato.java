package EstudioCaso5y6;

public class DocenteContrato extends Docente {
	
	//ATRIBUTOS
	private double sueldoContrato;
	
	//CONSTRUCTOR
	public DocenteContrato(String nombre, double salario) {
		super(nombre, salario);
	}
	
	//M�todos propios
	public void calcularSueldo() {
		sueldoContrato = super.salario-(super.salario*0.10);
	}//fin m�todo calcularSueldo�
	
	public double dameSueldo() {
		double sueldo=sueldoContrato;
		return sueldo;
	}//fin m�todo dameSueldo
	
	
	//M�todo toString
	public String toString() {
		return "\nNombre Docente: " + getNombre() + "\nSalario: " + getSalario() + "\nTotal: " + dameSueldo();
	}
	
	
	
	
}
