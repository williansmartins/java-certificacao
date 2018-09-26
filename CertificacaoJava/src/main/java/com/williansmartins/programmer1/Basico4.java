package com.williansmartins.programmer1;

/**
 * Importe outros pacotes Java e deixe-os acessíveis ao seu código
 *
 */

import java.util.Date;

import java.util.Date;
import java.util.Date;
import java.util.Date; //nao tem problema import duplicado...
//import static com.williansmartins.programmer1.estaticos.*; //nao consegui importar
//import java.sql.Date; //nao pode importar classes com o mesmo nome
//import java.util.*; //aqui nao da erro por ter duas classes com o mesmo nome
//import java.sql.*;  //sendo importada, mas sim porque na hora de usar o compilador nao sabe qual usar
//import ClasseDePacotePadrao; //nao pode importar classe de pacote padrao

class Basico4 
{
	
	Basico1 b; //nao precisa importar quando esta no mesmo pacote
	Date d1;
	java.sql.Date d2; //tem que usar o fully qualified name 
	
	public static void main(String[] args) {
		System.out.println("H");
//		ClasseDePacotePadrao c = new ClasseDePacotePadrao();//nao pode importar classe de pacote padrao
	}
}



