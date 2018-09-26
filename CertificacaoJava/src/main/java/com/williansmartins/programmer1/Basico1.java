package com.williansmartins.programmer1;

/**
 * Defina o escopo de variáveis
 *
 */
public class Basico1 
{
	int a = 10;

    public void metodo() {
        int a = 20; // shadowing
        System.out.println(a); // imprime 20
    }
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new Basico1().metodo();
    }
    
//    problemas clássicos1
//    public static void main(String[] x) {
//        x = 200;
//        System.out.println(x);
//    }
    
    
    
}
