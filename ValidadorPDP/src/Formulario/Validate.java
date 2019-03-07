package Formulario;

import Validadores.Validador;

public class Validate {
	private Validador v;
	
	public Validate(Validador v) {
		this.v = v;
	}
	
	public Validador getValidador() {
		return v;
	}
	
	public void setValidador(Validador v) {
		this.v = v;
	}
}
