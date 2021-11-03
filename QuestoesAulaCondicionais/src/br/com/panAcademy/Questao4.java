package br.com.panAcademy;

import java.util.Scanner;

/* Questão 4
 * Faça um programa que pede duas notas de um aluno. Em seguida ele deve calcular a média do aluno e dar o seguinte resultado:
 * A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
 * A mensagem "Reprovado", se a média for menor do que sete;
 * A mensagem "Aprovado com Distinção", se a média for igual a dez.
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
			System.out.println("Aprovado com Distinção, média: " + media);
		}else if(media >=7) {
			System.out.println("Aprovado, média: " + media);
		}else {
			System.out.println("Reprovado, média: " + media);
		}		
		
		ler.close();
	}

}
