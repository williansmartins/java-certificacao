//comentario acima pode
//pular linha pode

package com.williansmartins.programmer1;
//sem pacote, vira pacote padrão(default)
//package deve ser a primeira instrução


/**
 * Defina a estrutura de uma classe Java
 *
 */
public /* comentário no meio da linha po */ class Basico2 
{
	//membro de classe
	//variaveis de instancia
	int a = 10;
	int Basico2 = 40; //bizarro, mas pode
	
	//variavel estatica(compartilhada)
	static int b = 20;
	
	//isto não é um construtor
	void Basico2() {
        System.out.println(Basico2);
    }
	
	Basico2(){
		super();
		return; //bizarro, mas pode
	}
	
	Basico2(int c){
		if(c > 1) {
			return; //somente retorno vazio pode
		}else {
			return; //somente retorno vazio pode
		}
	}

    public void metodo() {
        int a = 30; // shadowing
        System.out.println(a); // imprime 20
    }
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new Basico2().metodo();
    }
    
//    problemas clássicos1
//    public static void main(String[] x) {
//        x = 200;
//        System.out.println(x);
//    }
    
    
    
}

class nomeEmMinusculoPode{
	
}

interface Autenticavel1 {

    final int TAMANHO_SENHA = 8;

    void autentica(String login, String senha);
}

//nao pode ter uma interface publica junto com uma classe publica
//public interface Autenticavel2 {
//
//    final int TAMANHO_SENHA = 8;
//
//    void autentica(String login, String senha);
//}
