/**
 * Meu primeiro programa Java
 * 
 * Este programa mostra ao aluno:
 * 1) Um programa Java é construído de um projeto Java
 * 2) Todo programa Java deve ter uma classe com  método main
 * 3) Como exibir informações do terminal (console)
 * 4) Como ler um string do terminal (console) do Java
 * 
 */
package MeuPrimeiroPrograma;

import java.util.Scanner;

/**
 * @author Metralhamat
 * data: 03/02/2021
 */
public class Principal { //classe que contém o método principal
	public static void main(String[] args) { //esse é o método principal
		System.out.println("Olá amigo!\nQual é o seu nome?");

		//Teste de push
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
				
		//teste do pull
		System.out.printf("Olá %s", nome);
		in.close();
	}

}
