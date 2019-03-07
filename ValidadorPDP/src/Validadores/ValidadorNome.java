package Validadores;

public class ValidadorNome implements Validador{
	protected String nome;
	
	public ValidadorNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean isValid() {
		if(nome.matches("[a-zA-Z^ ]+")) {
			return true;
		}else {
			return false;
		}
	}
}
