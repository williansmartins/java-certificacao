package com.williansmartins.programmer1.b;

/*
 * Criando e Manipulando Strings
*/

public class F {
	
	void exercicio1() {
//        String msg;
//        if (!msg.isEmpty())
//            System.out.println(msg);
//        else
//            System.out.println("vazio");
    }

	void exercicio2() {
		String s = "Caelum";
	    s.concat(" - Ensino e Inovação");
	    System.out.println(s);
	    
	    StringBuffer s2 = new StringBuffer("Caelum");
	    s2.append(" - Ensino e Inovação");
	    System.out.println(s2);
	}

	void exercicio3() {
		String vazio = null;
        String full = "Bem-vindo " + vazio;
        System.out.println(full);
	}
	
	void exercicio4() {
//		String vazio;
//        String full = "Bem-vindo " + vazio;
//        System.out.println(full);
	}
	
	String vazio;
	void exercicio5() {
		String full = "Bem-vindo " + vazio;
        System.out.println(full);
	}

	void exercicio6() {
		String s = null;
        String s2 = new String(s);
        System.out.println(s2);
	}

	void exercicio7() {
//		String s2 = new String(null);
//        System.out.println(s2);
	}
	
	void exercicio8() {
		int valor = 10;
        int dividePor = 4;
        double resultado = valor / dividePor;
        System.out.println(valor + dividePor + "");
        System.out.println("" + resultado + valor );
	}

	void exercicio9() {
//		String s = "estudando para a certificação";
//        s.replace("e", 'a');
//        System.out.println(s);
	}
	
	void exercicio10() {
		StringBuilder sb = new StringBuilder("guilherme");
		System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));
		System.out.println(sb.indexOf("k") + sb.lastIndexOf("k"));
	}
	
	public static void main (String[] args){
        new F().exercicio10();
    }
}