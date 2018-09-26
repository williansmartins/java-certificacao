package com.williansmartins.programmer1.b;

/*
 * Declarar e inicializar variáveis
*/
public class A {
	
//	valores default
//	primitivos numéricos inteiros - 0
//	primitivos numéricos com ponto flutuante - 0.0
//	boolean - false
//	char - vazio, equivalente a 0
//	referências - null
//	
	
//	byte - 1 byte (8 bits, de -128 a 127);
//	short - 2 bytes (16 bits, de –32.768 a 32.767);
//	char - 2 bytes (só positivo), (16 bits, de 0 a 65.535);
//	int - 4 bytes (32 bits, de –2.147.483.648 a 2.147.483.647);
//	long - 8 bytes (64 bits, de –9.223.372.036.854.775.808 a 9.223.372.036.854.775.807).
	
	
	static double tempo;
	static char c;
	String 
	variavelaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	;
	
	public static void main(String[] args) {
		int 
		idade
		;
		//System.out.println(idade); // erro de compilação
		
		System.out.println(tempo);
		System.out.println("char" + c);
		
		int[] numeros = new int[10];
		System.out.println(numeros[0]); // imprime 0
		
		int depoisDoJava7 = 123_456_789;
		System.out.println(depoisDoJava7); // imprime 123456789

		System.out.println(0xa10_AF_75); // imprime 168865653
		
		char c = 65;
		System.out.println(c); // imprime A
		
		char cc = 2;
		System.out.println(cc); // imprime
		
		for (char i = 0; i < 256; i++ ) {
			System.out.println("posicao: " + cc); 
		}
		
		char ccc = '\u0065'; // unicode
		System.out.println(ccc); // imprime a letra grega ômega
		
		for(char cccc='a';cccc <= 'z';cccc++) {
            System.out.println(cccc);
        }
	}
		
	void metodo(int a) {
	    double x;
	    if(a > 1) {
	        x = 6;
	    }
	    //System.out.println(x); // talvez x não tenha sido 
	                           // inicializado, portanto não compila
	}
}
