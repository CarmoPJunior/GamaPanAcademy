package br.com.panAcademy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		String resposta = "N"	;	
		
		while(resposta.toUpperCase() !="S") {
			
			try{
				
				System.out.println("Informe um número:");
				int numero  = ler.nextInt();
				 
				for(int i= 1; i<=10; i++) {					 
					System.out.printf("%d \t x \t %d \t = \t %d  \n", i, numero, (i * numero));
				}
				
				System.out.println("Deseja sair? 'S' para sair, 'N' para continuar: \n");
				resposta = ler.next();
				
			}catch (InputMismatchException e) {
				System.out.println("Erro: Informe um número! \n");	
				ler.next();
			}		
						
		}

		
		ler.close();
	}

}
