package com.williansmartins.programmer1.b;

/*
 * Diferenciar entre variáveis de referências a objetos e tipos primitivos
*/

class B2 {
    int v = 15;
}

public class B {
	
	public static void main(String[] args) {
		passagemPorReferencia();
	}
	
	static void passagemPorReferencia() {
		B2 x = new B2();
        B2 y = x;
        y.v++;
        x.v++;
        B2 z = y;
        z.v--;
        System.out.println(x.v + y.v + z.v);
	}
	
	static void passagemPorValor() {
		int x = 15;
		int y = x;
		y++;
		x++;
		int z = y;
		z--;
		System.out.println(x + y + z);
	}
		
}