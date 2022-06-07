
package com.acb.eed.examen.OptimizacionYDocumentacion;

/**
 * Clase perro - estado(nombre , edad)
 * 
 * @author Antonio Carmona Bascon
 *
 */
public class Perro extends Mascota {
	/**
	 * Ladrido del perro
	 */
	private static final String GUAUUUUUUUUUU = "GUAUUUUUUUUUU";
	/**
	 *  Edad del perro
	 */
	private int age;
	/**
	 * Crea un perro
	 * 
	 * @param name nombre del perro
	 * @param age edad del perro
	 * @throws EdadErroneaException si la edad es menos que 0
	 */
	public Perro(String name, int age) throws EdadErroneaException {
		super();
		setAge(age);
		this.name = name;
	}

	/**
	 * Asigna una edad al perro
	 * 
	 * @param age edad del perro
	 * @throws EdadErroneaException si la edad es menos que 0
	 */
	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.age = age;
	}

	/**
	 * Devuelve la edad
	 * 
	 * @return age la edad
	 */
	public int getAge() {
		return this.age;
	}
	

	/**
	 * El perro ladra
	 * 
	 * @return GUAUUUUUUUUUU (ladrido)
	 */
	public String ladrar() {
		return GUAUUUUUUUUUU;
	}

}
