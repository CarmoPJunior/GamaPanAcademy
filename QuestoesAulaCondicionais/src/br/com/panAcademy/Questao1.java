package br.com.panAcademy;

/*Quest�o 1: 	
* Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior e qual o menor.*	
*/
public class Questao1 {

	public static void main(String[] args) {
		
		int num1 = 3, num2 = 8, num3 = 5;
				
		if(num1> num2 && num1> num3) {
			System.out.println("O maior n�mero �:" + num1);						
		}else if(num2> num1 && num2> num3) {
			System.out.println("O maior n�mero �:" + num2);			
		}else if(num3> num1 && num3> num2) {
			System.out.println("O maior n�mero �:" + num3);			
		}
				
		if(num1< num2 && num1< num3) {
			System.out.println("O menor n�mero �:" + num1);						
		}else if(num2< num1 && num2< num3) {
			System.out.println("O menor n�mero �:" + num2);			
		}else if(num3< num1 && num3< num2) {
			System.out.println("O menor n�mero �:" + num3);			
		}

	}


}
