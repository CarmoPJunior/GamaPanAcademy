package br.com.panAcademy;

import java.util.Scanner;

/*
 * Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio. A senha v�lida � o n�mero 1234.
 * Devem ser	impressas as seguintes	mensagens: ACESSO	PERMITIDO	caso	a	senha	seja	v�lida. 
 * ACESSO	NEGADO	caso	a	senha	seja	inv�lida.
*/
 public class Questao3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a Senha: ");
		String senhaValida = "1234";
		String senha = ler.next();
		
		if(senha.equals(senhaValida)) {
			System.out.println("ACESSO PERMITIDO!");
		}else {
			System.out.println("ACESSO NEGADO!");
		}
		
		ler.close();
	}

}
