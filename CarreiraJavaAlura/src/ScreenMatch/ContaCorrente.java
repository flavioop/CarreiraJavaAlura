package ScreenMatch;

import java.util.Scanner;

public class ContaCorrente {
	
	public static void main(String[] args) {
		
		String nome = "";
		String tipoDeConta = "";
		double saldoInicial = 2500.00;
		double transacao = 0;		
		int opcao = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o nome do cliente");
	    nome = entrada.nextLine();
	    
	    System.out.println("Informe o tipo de conta");
		tipoDeConta =  entrada.nextLine();
		
		System.out.println("*****************************************************");	
		System.out.println("Dados iniciais do cliente");
		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("Tipo conta: " + tipoDeConta);
		System.out.println("Saldo inicial: " + saldoInicial);		
		
		System.out.println("*****************************************************");
		
		System.out.println("");
		System.out.println("");
		System.out.println("Operações");
		
		System.out.println("");
		
		String menu = """
				
				**Digite sua opção**
				
		        1- Consultar saldos
		        2- Receber valores
		        3- Transferir valores
		        4- Sair
		        
		        
				""";
		
		 
		
		
		while(opcao != 4) {		 	
			System.out.println(menu);
			opcao = entrada.nextInt();
			
			if(opcao == 1) {
				
				System.out.println("O saldo é: " + saldoInicial);
				
			}else if(opcao == 2){
				
			
				System.out.println("Informe o valor do depósito");
				   transacao = entrada.nextInt();
				   
				   saldoInicial =  saldoInicial +  transacao;
				   
				 System.out.println("Saldo atualizado: " + saldoInicial);   
				   
			}else if(opcao == 3){
				
				System.out.println("Informe o valor do saque");
				   transacao = entrada.nextInt();
				   
				   if(transacao > saldoInicial) {
					   System.out.println("Saldo insuficiente");
				   }else {
					   saldoInicial =  saldoInicial -  transacao;
				   }
				   
				 System.out.println("Saldo atualizado: " + saldoInicial);  
				   
			}else if(opcao == 4){
				System.out.println("Saindo do sistema");
				
			}else {
				System.out.println("Opção invalida");
			}
			
			
			
		}	
		
	}
		

	}		
			
		/*
				switch (opcao) {
				   case 1:
					   			   
					   System.out.println("O saldo é: " + saldoInicial);
					   
				      break;
				   case 2:
					   
					   System.out.println("Informe o valor do depósito");
					   transacao = entrada.nextInt();
					   
					   saldoInicial =  saldoInicial +  transacao;
					   
					   
					   System.out.println("Saldo atualizado: " + saldoInicial);
					   break;
				      
				   case 3:
					   
					   System.out.println("Informe o valor do saque");
					   transacao = entrada.nextInt();
					   
					   if(transacao > saldoInicial) {
						   System.out.println("Saldo insuficiente");
						   break;
						   
					   }
					   
					   saldoInicial =  saldoInicial -  transacao;
					   
					   
					   System.out.println("Saldo atualizado: " + saldoInicial);
					   
					   break;
				      
				   case 4:
					   
					   System.out.println("Saindo do sistema");
					   
				      break;
				 		   default:
				 			   System.out.println("Opção invalida");
				 			  
				      break;
				}

				
				break;
		}
		*/
		
		
		
	
