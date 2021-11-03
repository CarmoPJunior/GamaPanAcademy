package br.com.panAcademy;


//2- Faça um programa que mostre uma contagem na tela de 233 a 456, 
//só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver
public class Questao6 {
		
	public static void main(String[] args) {
					
		for(int num = 233; num<= 456; ) {
			
			System.out.println("Contagem: " + num);
			
			if(num>= 300 && num <= 400) {				
				num+= 3;
			}else {				
				num+= 5;
			}
						
		}		
		
		
		
		
		
	}

}
