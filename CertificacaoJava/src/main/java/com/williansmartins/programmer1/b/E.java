package com.williansmartins.programmer1.b;

/*
 * Chamadas de métodos nos objetos
*/

class Calculadora{
    public int soma(int... nums){
        int total = 0;
        for (int a : nums){
            total+= a;
        }
        return total;
    }

}
public class E {
	
	public static void main (String[] args){
        Calculadora c = new Calculadora();    

        //Todas as chamadas abaixo sao válidas
        System.out.println(c.soma());
        System.out.println(c.soma(1));
        System.out.println(c.soma(1,2));
        System.out.println(c.soma(1,2,3,4,5,6,7,8,9));
    }
}