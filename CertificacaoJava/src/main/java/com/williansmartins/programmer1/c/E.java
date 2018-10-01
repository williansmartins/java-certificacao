package com.williansmartins.programmer1.c;

/*
 * Utilize o if e if/else e Utilize o switch
*/

public class E {
	
	void exercicio1() {
//		int quantidade = 15;
//        if(quantidade=15) {
//            System.out.println("sim");
//        } else {
//            System.out.println("nao");
//        }
	}
	
	void exercicio2() {
		String nome = "guilherme";
        if(nome.equals("guilherme"))
            System.out.println(nome);
            System.out.println("bom");
//        else
//            System.out.println("melhor ainda");
//            System.out.println(nome);
    }
	
	void exercicio3() {
		String s1 = "s1";
        String s2 = s1.substring(0, 1) + s1.substring(1,2);
        String s3 = "s" + s1.substring(1,2).toString();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
    }
	
	void exercicio4() {
		String s1 = "s1";
        String s2 = s1.substring(0, 2);
        String s3 = s1.substring(0, 1) + s1.substring(1,2);
        
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
    }
	
	void exercicio5() {
//		byte b1 = 5;
//        byte b2 = 3;
//        byte b3 = b1 + b2;
	}
	
	void exercicio6() {
		int i;
        for (i = 0; i < 5; i++) {
            if (++i % 3 == 0) {
                break;
            }
        }
        System.out.println(i);
	}

	void exercicio7() {
		int i1 = 3;
		
		char c = 65;
        char c2 = 68 - 65; //pode
//        c2 = i1; //naturalmente não pode ser atribuido a um char
        
        System.out.println(c + c2);
	}
	
	void exercicio8() {
		String resultado = "Divisao dá: " + 15 / 0.0;
        System.out.println(resultado);
	}

	void exercicio9() {
		//System.out.println(1==true);
	}
	
	public static void main(String[] args) {
		new E().exercicio2();
	}
	
}
