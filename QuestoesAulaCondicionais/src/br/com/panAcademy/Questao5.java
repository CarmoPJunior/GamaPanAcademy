package br.com.panAcademy;

import java.util.ArrayList;
import java.util.List;

//
//1- A prefeitura de uma cidade fez uma pesquisa 
//entre 20 de seus habitantes, coletando dados sobre o sal�rio e n�mero de filhos. 
//A prefeitura deseja saber:  

//a) m�dia do sal�rio da popula��o;
//b) m�dia do n�mero de filhos;
//c) maior sal�rio;
//d) percentual de pessoas com sal�rio at� R$100,00.
public class Questao5 {
	
	
	public static void main(String[] args) {
		
		double totalSalarios = 0.0;		
		double maiorSalario = 0.0;
		int totalFilhos =0 ;
		int pessoasComSalarioAte100 = 0;
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(800.00, 2));
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(500.00, 2));
		pessoas.add(new Pessoa(400.00, 1));
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(300.00, 5));
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(100.00, 2));
		pessoas.add(new Pessoa(100.00, 2));
						
		
		for(Pessoa pessoa : pessoas) {
			
			totalSalarios +=pessoa.salario;
			totalFilhos += pessoa.numeroFilhos;
			
			if(maiorSalario < pessoa.salario) {
				maiorSalario = pessoa.salario;
			}
						
			if(pessoa.salario <= 100) {
				pessoasComSalarioAte100 ++;
			}
			
		}		
		
		double mediaSalario =  totalSalarios /20.0;
		double mediaFilhos = totalFilhos /20;
		double percentual = pessoasComSalarioAte100/20.0 *100.0;
		
		System.out.println("m�dia do sal�rio da popula��o: "+ mediaSalario);
		System.out.println("m�dia do n�mero de filhos: " + mediaFilhos);
		System.out.println("maior sal�rio: " + maiorSalario);
		System.out.println("percentual de pessoas com sal�rio at� R$100,00: " + percentual);
	}
	
	
	
	static class Pessoa {
		
		double 	salario;
		int 	numeroFilhos;
		
		public Pessoa(double salario, int numeroFilhos) {
			super();
			this.salario = salario;
			this.numeroFilhos = numeroFilhos;
		}		
		
	}
	
	

}
