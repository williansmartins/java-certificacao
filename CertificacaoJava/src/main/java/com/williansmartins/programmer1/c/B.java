package com.williansmartins.programmer1.c;

/*
 * Utilize o switch
*/

public class B {
	
	
	void exercicio1() {
		//s -> c
//		short s = 10;
//      char c = s;
        
		//c -> s
//      char c = 10;
//      short s = c;
        
        //c -> l
		char c = 10;
		long l = c;
	}
	
	void exercicio2() {
		int i1 = 3/2;
		double i2 = 3/2;
		double i3 = 3/2.0;

		long x = 0; double d = 0;
		double zero = x + d;
		System.out.println(i1 + i2 + i3 + x + d + zero);
    }
	
	void exercicio3() {
		System.out.println(3 / 0);
		System.out.println(3 / 0.0);
		System.out.println(3.0 / 0);
		System.out.println(-3.0 / 0);
    }
	
	void exercicio4() {
		int $$ = 5;
        int __ = $$++;
        if (__ < ++$$ || __-- > $$)
            System.out.print("A");

        System.out.print($$);
        System.out.print(__);
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
		char c = 65;
        char c2 = 68 - 65;
        System.out.println(c + c2);
	}
	
	void exercicio8() {
		int a = 10;
		a += ++a + a + ++a;
		System.out.println(a);   //10+11+11+12
	}
	
	public static void main(String[] args) {
		new B().exercicio7();
	}
	
}
