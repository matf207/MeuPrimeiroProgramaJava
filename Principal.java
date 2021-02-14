/**
 * Meu primeiro programa Java
 * 
 * Este programa mostra ao aluno:
 * 1) Um programa Java � constru�do de um projeto Java
 * 2) Todo programa Java deve ter uma classe com  m�todo main
 * 3) Como exibir informa��es do terminal (console)
 * 4) Como ler um string do terminal (console) do Java
 * 
 */
package MeuPrimeiroPrograma;

import java.util.Scanner;

/**
 * @author Metralhamat
 * data: 03/02/2021
 */
public class Principal { //classe que cont�m o m�todo principal
	public static void main(String[] args) { //esse � o m�todo principal
		System.out.println("Ol� amigo!\nQual � o seu nome?");

		//Ler uma string do console usando a biblioteca Scanner
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
				
		//Exibir um string usando printf
		System.out.printf("Ol� %s", nome);
		in.close();
	}

}
