package com.williansmartins.programmer1.d;

import java.util.*;

/*
 * Declare e use um ArrayList - Iterator e o enhanced for
*/
public class E {
	
	void exercicio1() {
		ArrayList<String> c = new ArrayList<String>();
        c.add("a");
        c.add("c");
        System.out.println(c.remove("a"));
	}
	
	void exercicio2() {
		ArrayList<String> c = new ArrayList<String>();
        c.add("a");
        c.add("a");
        System.out.println(c.remove("a"));
        System.out.println(c.size());
    }
	
	void exercicio3() {
		ArrayList<String> list = new ArrayList<>();
        list.add("a");list.add("b");
        list.add("a");list.add("c");
        list.add("a");list.add("b");
        list.add("a");
        System.out.println(list.lastIndexOf("b"));
	}
	
	void exercicio4() {
//		ArrayList<String> l = new ArrayList<String>();
//        l.add("a");
//        l.add("b");
//        l.add(1,"amor");
//        l.add(3,"baixinho");
//        System.out.println(l);
//        String[] array = l.toArray();
//        System.out.println(array[2]);
	}
	
	void exercicio5() {
		ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        ArrayList<String> c = new ArrayList<String>();
        b.add("a");c.add("c");
        b.add("b");c.add("d");
        a.addAll(b);
        a.addAll(c);
        System.out.println(a.get(0));
        System.out.println(a.get(3));
	}
	
	void exercicio6() {
//		ArrayList<String> a = new ArrayList<String>();
//        a.add("a", 0);
//        a.add("b", 0);
//        a.add("c", 0);
//        a.add("d", 0);
//        System.out.println(a.get(0));
//        System.out.println(a.get(1));
//        System.out.println(a.get(2));
//        System.out.println(a.get(3));
	}

	void exercicio7() {
		ArrayList<String> a = new ArrayList<String>();
	    a.add(0,"a");
	    a.add(1,"b");
	    
	    for(Iterator<String> i=a.iterator(); i.hasNext(); i.next()) {
	        String element = i.next();
	        System.out.println(element);
	    } 
	}
	
	void exercicio8() {
		ArrayList<String> ss = new ArrayList<String>();
        ss.add("a");
        ss.add("b");
        ss.add("c");
        ss.add("d");

        for(String s:ss){
            if(s.equals("c")) s = "b";
            else if(s.equals("b")) s= "c";
        }
        for(String s:ss) System.out.println(s);
	}
	
	public static void main(String[] args) {
		new E().exercicio8();
	}
		
}
