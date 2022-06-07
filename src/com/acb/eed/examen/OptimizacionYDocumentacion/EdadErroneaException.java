package com.acb.eed.examen.OptimizacionYDocumentacion;

/**
 * Excepcion lanzada para indicar si la edad es erronea
 * 
 * @author Antonio Carmona Bascon
 *
 */
public class EdadErroneaException extends Exception {

	/**
	 * Serial de la excepcion
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construye una excepcion EdadErroneaException con el mensaje
	 * 
	 * @param message mensaje
	 */
	public EdadErroneaException(String messages) {
		super(messages);
	}
}
