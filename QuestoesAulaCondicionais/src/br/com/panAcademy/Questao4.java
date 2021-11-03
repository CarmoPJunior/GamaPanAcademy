package br.com.panAcademy;

import java.util.Scanner;

/* Quest�o 4
 * Fa�a um programa que pede duas notas de um aluno. Em seguida ele deve calcular a m�dia do aluno e dar o seguinte resultado:
 * A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
 * A mensagem "Reprovado", se a m�dia for menor do que sete;
 * A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.
 */
public class Questao4 {
	
	public static void main(String[] args) {
				
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = ler.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = ler.nextDouble();
		
		double media = ((nota1 + nota2 )/ 2);		
				
		if(media == 10) {
			System.out.println("Aprovado com Distin��o, m�dia: " + media);
		}else if(media >=7) {
			System.out.println("Aprovado, m�dia: " + media);
		}else {
			System.out.println("Reprovado, m�dia: " + media);
		}		
		
		ler.close();
	}

}
