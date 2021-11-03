package br.com.panAcademy;

import java.util.Scanner;


//Calcular média de X alunos.
//Notas válidas: entre 0 e 10
//Contar quantas notas válidas foram digitadas
//Usuário deve digitar -1 para sair do programa e ser informado da sua média e quantidade de notas

public class WhileExercicio {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int quantidadeNotas = 0;
		double total = 0.0;		
		double nota = 0.0;
		
		while(nota != -1) {
			
			System.out.println("Digite uma nota válida entre 0 e 10 ou digite -1 para sair: \n");
			nota = ler.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
	            quantidadeNotas ++;
	            total += nota;
	        } else if (nota != -1) {
	            System.out.println("Nota inválida");
	        }
			
		}
		
		double media = total / quantidadeNotas;
		System.out.println("Quantidade de notas válidas:"  + quantidadeNotas);
		System.out.println("A média das notas são: " + media);
		
		ler.close();

	}

}
