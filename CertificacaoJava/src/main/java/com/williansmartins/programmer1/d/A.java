package com.williansmartins.programmer1.d;

/*
 * Declare, instancie, inicialize e use um array uni-dimensional
*/
public class A {
	
	
	void exercicio1() {
		//declarar
		int[] nomeDoArray1;
		double nomeDoArray2[];
		long []nomeDoArray3;
		long[]nomeDoArray4;
	}

	
	void exercicio2() {
		int[] numeros;
		numeros = new int[]{1,2,5,7,5};
		System.out.println(numeros);
		System.out.println(numeros[0]);
    }
	
	void exercicio3() {
		//compila e roda
		int[] numeros = new int[0];
		
		//compila, mas joga NegativeArraySizeException
		numeros = new int[-1];

		//somente se na mesma linha
		int[] numeros2 = {1,2,5,7,5}; 
	}
	
	void exercicio4() {
		int[] x1;

		//[]int x2; //nao pode assim

		int x3[];

		int[]x4;

		int [] x5;
	}
	
	void exercicio5(){
		//int y[] = new int[3] {0,3,5}; //nao pode dizer as duas coisas
		//tamanho e valor
		int x[] = new int[]{0,3,5};  //ok
		int y[] = new int[] {0,3,5}; //ok
	}
	
	public static void main(String[] args) {
		new A().exercicio4();
	}
		
}
