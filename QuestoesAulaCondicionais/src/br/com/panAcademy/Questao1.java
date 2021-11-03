package br.com.panAcademy;

/*Questão 1: 	
* Faça um programa que receba três inteiros e diga qual deles é o maior e qual o menor.*	
*/
public class Questao1 {

	public static void main(String[] args) {
		
		int num1 = 3, num2 = 8, num3 = 5;
				
		if(num1> num2 && num1> num3) {
			System.out.println("O maior número é:" + num1);						
		}else if(num2> num1 && num2> num3) {
			System.out.println("O maior número é:" + num2);			
		}else if(num3> num1 && num3> num2) {
			System.out.println("O maior número é:" + num3);			
		}
				
		if(num1< num2 && num1< num3) {
			System.out.println("O menor número é:" + num1);						
		}else if(num2< num1 && num2< num3) {
			System.out.println("O menor número é:" + num2);			
		}else if(num3< num1 && num3< num2) {
			System.out.println("O menor número é:" + num3);			
		}

	}


}
