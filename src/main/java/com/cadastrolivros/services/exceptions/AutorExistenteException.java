package com.cadastrolivros.services.exceptions;

public class AutorExistenteException extends RuntimeException {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2968587651521684746L;

	public AutorExistenteException(String mensagem) {
		super(mensagem);
	}
	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}

