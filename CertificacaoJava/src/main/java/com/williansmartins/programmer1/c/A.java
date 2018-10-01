package com.williansmartins.programmer1.c;

/*
 * Utilize o switch
*/

public class A {
	
	
	void exercicio1() {
		String[] args = new String[] {"a"};
		int tamanho = args.length;
        switch(tamanho) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            default:
                System.out.println("mais argumentos");
        }
	}
	
	void exercicio2() {
		switch("Guilherme") {
	        case "Guilherme": 
	            System.out.println("Guilherme");
	            break;
	        case "42":
	            System.out.println("42");
	        default:
	            System.out.println("Outro nome");
	    }
    }
	
	void exercicio3(String[] args) {
//        int count = args.length;
//        switch(count) {
//            case 0 {
//                System.out.println("nenhum");
//                break;
//            } case 1 {
//            } case 2 {
//                System.out.println("ok");
//            } default {
//                System.out.println("default");
//            }
//        }
    }
	
	void exercicio4(String[] args) {
        int count = args.length;
        switch(count) {
            case 0 :{
                System.out.println("nenhum");
                break;
            } case 1 :{
            } case 2 :{
                System.out.println("ok");
            } default :{
                System.out.println("default");
            }
        }
    }
	
	void exercicio5() {
//		switch(10) {
//	        case < 10:
//	            System.out.println("menor");
//	        default:
//	            System.out.println("igual");
//	        case > 10:
//	            System.out.println("maior");
//	    }
	}
	
	void exercicio6() {
//		switch(10) {
//	        case 10:
//	            System.out.println("a");
//	            break;
//	            System.out.println("b");
//	        default:
//	            System.out.println("c");
//	        case 11:
//	            System.out.println("d");
//	    }
	}

	void exercicio7() {
		//DIVISOES POR ZERO
		
		//INTEIRO
		int int1 = 1;
		//System.out.println(int1 / 0); //java.lang.ArithmeticException: / by zero
		System.out.println(int1 / 0.0); //Infinity
		
		//FLUTUANTES
		double d1 = 0.0;
		float f1 = 0.0f;
		double div1 = int1 / d1;
		float div2 = int1 / f1;
		
		System.out.println(div1); //Infinity
		System.out.println(div2); //Infinity
		
		//NAN
		System.out.println(div1/div2);
		
		
	}
	
	void exercicio8() {
		int a = 10;
		a += ++a + a + ++a;
		System.out.println(a);   //10+11+11+12
	}
	
	private void metodo(String string) {
		System.out.println(string);
	}

	public static void main(String[] args) {
		new A().exercicio8();
	}
		
}
