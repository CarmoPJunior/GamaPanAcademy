package br.com.panAcademy;

import java.time.LocalDate;

/*Quest�o 2: 	
* Escreva um programa para ler o ano de nascimento de uma pessoa e escrever 
* uma mensagem que diga se ela poder� ou n�o votar este ano 
* (n�o � necess�rio	considerar	o	m�s	em	que	ela nasceu).
*/

public class Questao2 {

	public static void main(String[] args) {
		
		int anoNascimento 	= 2012;  
		int	anoAtual 		= LocalDate.now().getYear();		
		int idade = anoAtual - anoNascimento;		
		
				
		if(idade >= 18 && idade < 65){
			System.out.println("Voc� pode votar este ano!");
		}else if(idade >=16 && idade <18 || idade >65) {			
			System.out.println("Voto facultativo!");			
		}else {
			System.out.println("VOc� n�o pode votar este ano!");
		}
				
	}

}
