package com.williansmartins.programmer1.b;

/*
 * Lendo ou escrevendo campos de objetos
*/

class C2{ 
    int c;
    
    void c(int c) {
        this.c = c;
        //c = c; pegadinha
    }
}

public class C {
    public static void main(String[] args) {
    	C2 b = new C2();
        b.c = 10;
        System.out.println(b.c);
        b.c(30);
        System.out.println(b.c);
    }
}