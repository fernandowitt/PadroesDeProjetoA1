package Formulario;

import java.text.ParseException;

import Validadores.*;

public class Form {

	public static void main(String[] args) throws ParseException {
		Validador validador1 = new ValidadorCPF("133.267.246-91");
		Validador validador2 = new ValidadorNome("Joaquim Cardoso");
		Validador validador3 = new ValidadorCNPJ("13.347.016/0001-17");
		Validador validador4 = new ValidadorData("10-12-1990");
		
		Validador validador5 = new ValidadorCPF("123.456.789-10");
		Validador validador6 = new ValidadorNome("J04qu1m Ch4V0$0 63");
		Validador validador7 = new ValidadorCNPJ("11.222.333/4444-55");
		Validador validador8 = new ValidadorData("10-12-1890");
		
		Validate v = new Validate(validador1);
		System.out.println(v.getValidador().isValid());
		v.setValidador(validador2);
		System.out.println(v.getValidador().isValid());
		v.setValidador(validador3);
		System.out.println(v.getValidador().isValid());
		v.setValidador(validador4);
		System.out.println(v.getValidador().isValid());
		
		v.setValidador(validador5);
		System.out.println(v.getValidador().isValid());
		v.setValidador(validador6);
		System.out.println(v.getValidador().isValid());
		v.setValidador(validador7);
		System.out.println(v.getValidador().isValid());
		v.setValidador(validador8);
		System.out.println(v.getValidador().isValid());
	}

}
