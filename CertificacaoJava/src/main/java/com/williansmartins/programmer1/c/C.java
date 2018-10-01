package com.williansmartins.programmer1.c;

/*
 * Use parentêses para sobrescrever a precedência de operadores
*/

public class C {
	
	
	void exercicio1() {
		// String resultado = ("divisao dá: " + 15) / 0.0;
		//System.out.println(resultado);
	}
	
	void exercicio2() {
		System.out.print("exercicio2");
		System.out.println(((!(true==false))==true ? 1 : 0)==0);
    }
	
	public static void main(String[] args) {
		new C().exercicio2();
	}
	
}
