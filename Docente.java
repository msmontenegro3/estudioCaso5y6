package EstudioCaso5y6;

public class Docente {
	
	//ATRIBUTOS
	protected double sueldo;
	protected String nombre;
	protected double salario;
	
	//CONSTRUCTOR
	public Docente(String nombre, double salario) {
		this.nombre=nombre;
		this.salario=salario;
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Métodos Propios
	public void calcularSueldo(double salario) {
	}//fin método calcularSueldo
	
	public double dameSueldo() {
		return sueldo;
	}//fin método dameSueldo

	//Método toString
	public String toString() {
		return "Docente [getNombre()=" + getNombre() + ", getSalario()=" + getSalario() + "]";
	}//fin método toString
	
	
	
}
