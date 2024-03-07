/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D021224;

/**
 *
 * @author omarm
 */
public class Alumno {
	
	private int matricula;
	private String nombre;
	private String pApellido;
	private int edad;
	private String carrera;
	private byte semestre;

	
	
	public Alumno(int matricula, String nombre, String pApellido, int edad, String carrera, byte semestre) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.pApellido = pApellido;
		this.edad = edad;
		this.carrera = carrera;
		this.semestre = semestre;
	}
	
	

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getpApellido() {
		return pApellido;
	}

	public void setpApellido(String pApellido) {
		this.pApellido = pApellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public byte getSemestre() {
		return semestre;
	}

	public void setSemestre(byte semestre) {
		this.semestre = semestre;
	}

	
	
	
	
	
	
	
}
