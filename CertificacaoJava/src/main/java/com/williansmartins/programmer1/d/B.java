package com.williansmartins.programmer1.d;

/*
 * Declare, instancie, inicialize e use um array uni-dimensional - Array de referências
*/
public class B {
	
	
	void exercicio1() {
		int[] valores = new int[10];
	    //long[] vals = valores; // não compila
	}

	
	void exercicio2() {
		String[] valores = new String[2];
	    valores[0] = "Certificação";
	    valores[1] = "Java";

	    Object[] vals = valores;
	    for(Object valor : vals) {
	        System.out.println(valor); // Certificação e depois Java
	    }
    }
	
	void exercicio3() {
		Object[] valores = new Object[2];
	    valores[0] = "Certificação";
	    valores[1] = "Java";
	    
	    //compila mais não executa
	    //java.lang.ClassCastException
//	    String[] vals = (String[]) valores;
//	    
//	    for(Object valor : vals) {
//	        System.out.println(valor);
//	    }
	    
	    Object[ ] objetos = new Object[ 2 ];
	    String[ ] strings = new String[ 2 ];
	    System.out.println(objetos.getClass().getName()); 
	    // [ Ljava.lang.Object;
	    System.out.println(strings.getClass().getName()); 
	    // [ Ljava.lang.String;

	    System.out.println(strings.getClass().getSuperclass()); 
	    // java.lang.Object
	}
	
	void exercicio4() {
		//normal
		int x[] = new int[0];
        int y[] = new int[] {0,3,5};
        int z[] = {0,3,5};
	}
	
	void exercicio5() {
		int x[] = new int[3];
        for(x[1]=x.length-1;x[0]==0;x[1]--) {
            x[x[1]]=-5;
            System.out.println(x[1]);
        }
	}
	
	void exercicio6() {
		int x[] = new int[3];
        for(x[1]=x.length-1;x[1]>=0;x[1]--) {
            x[x[1]]=-5;
            System.out.println(x[1]);
        }
	}

	void exercicio7() {
		String[] valores = new String[2];
        valores[0] = "Certificação";
        valores[1] = "Java";
        Object[] vals = (Object[]) valores;
        vals[1] = "Daniela";
        System.out.println(vals[1].equals(valores[1]));
	}
	
	void exercicio8() {
		/*
		int[] array1 = new int[10];
		int array2[] = new int[10];
		int[] array3 = new int[]; //x
		int array4[] = new int[]; //x
		int[] array5 = new int[2]{1, 2}; //x
		int[] array6 = new int[]{1, 2};
		int[] array7 = int[10]; //x
		int[] array8 = new int[1, 2, 3]; //x
		int array9[] = new int[1, 2, 3]; //x
		int array10[] = {1, 2, 3};
		*/
	}
	
	public static void main(String[] args) {
		new B().exercicio7();
	}
		
}
